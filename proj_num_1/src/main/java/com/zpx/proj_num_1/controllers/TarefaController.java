package com.zpx.proj_num_1.controllers;

import com.zpx.proj_num_1.entities.Tarefa;
import com.zpx.proj_num_1.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public ResponseEntity<List<Tarefa>> findAll () {
        List<Tarefa> objs = tarefaService.findAll();
        return ResponseEntity.ok().body(objs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> findById (@PathVariable Long id) {
        Tarefa obj = tarefaService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


    @PostMapping
    public ResponseEntity<List<Tarefa>> createTarefa (@RequestBody Tarefa objs){
         List<Tarefa> newObjs = tarefaService.createTarefa(objs);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newObjs)
                .toUri();
         return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> updateTarefa (@RequestBody Tarefa obj, @PathVariable Long id) {
        obj.setId(id);
        tarefaService.updateTarefa(obj);
        return ResponseEntity.noContent().build();
    }

}
