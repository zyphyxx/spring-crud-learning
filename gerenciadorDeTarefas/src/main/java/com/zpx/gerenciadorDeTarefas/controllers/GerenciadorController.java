package com.zpx.gerenciadorDeTarefas.controllers;

import com.zpx.gerenciadorDeTarefas.entities.Tarefas;
import com.zpx.gerenciadorDeTarefas.services.TarefasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
@Api(value = "Gerenciador de Tarefas")
@CrossOrigin(origins = "*")
public class GerenciadorController {

    private final TarefasService service;

    @Autowired
    public GerenciadorController(TarefasService service) {
        this.service = service;
    }

    @PostMapping
    @ApiOperation(value = "Cria um item na lista de tarefas")
    public ResponseEntity<Tarefas> create(@RequestBody Tarefas tarefas, UriComponentsBuilder uriBuilder) {
        Tarefas obj = service.createTask(tarefas);
        URI uri = uriBuilder.path("/{id}")
                .buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(obj);
    }

    @GetMapping
    @ApiOperation(value = " Lista todas as tarefas")
    public ResponseEntity<List<Tarefas>> list() {
        List<Tarefas> list = service.listTask();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna uma tarefa pela ID")
    public ResponseEntity<Optional<Tarefas>> findById(@PathVariable Long id) {
        Optional<Tarefas> obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping
    @ApiOperation(value = "Atualiza as tarefas")
    public ResponseEntity<Tarefas> update(@RequestBody Tarefas tarefas) {
        Tarefas obj = service.updateTask(tarefas);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping
    @ApiOperation(value = "Apaga uma tarefa")
    public ResponseEntity<Void> delete(@RequestBody Tarefas tarefas) {
        service.deleteTask(tarefas);
        return ResponseEntity.noContent().build();
    }

    @ApiOperation(value = "Apaga uma tarefa pelo ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskPerId(@PathVariable Long id) {
        service.deleteTaskPerId(id);
        return ResponseEntity.noContent().build();
    }

}
