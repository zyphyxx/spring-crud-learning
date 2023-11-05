package com.zpx.gerenciadorDeTarefas.controll;

import com.zpx.gerenciadorDeTarefas.domain.Tarefas;
import com.zpx.gerenciadorDeTarefas.service.TarefasService;
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
public class GerenciadorControll {

    private final TarefasService service;

    @Autowired
    public GerenciadorControll(TarefasService service) {
        this.service = service;
    }

    @PostMapping
    @ApiOperation(value = "Cria um item na lista de tarefas")
    public ResponseEntity<Tarefas> create(@RequestBody Tarefas tarefas, UriComponentsBuilder uriComponentsBuilder) {
        URI location = uriComponentsBuilder.path("/tarefas/{id}")
                .buildAndExpand(service.createTask(tarefas)
                        .getId()).toUri();
        return ResponseEntity.created(location).body(service.createTask(tarefas));
    }

    @GetMapping
    @ApiOperation(value = " Lista todas as tarefas")
    public ResponseEntity<List<Tarefas>> list() {
        return ResponseEntity.ok(service.listTask());
    }


    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna uma tarefa pela ID")
    public ResponseEntity<Optional<Tarefas>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping
    @ApiOperation(value = "Atualiza as tarefas")
    public ResponseEntity<Tarefas> update(@RequestBody Tarefas tarefas) {
        return ResponseEntity.ok(service.updateTask(tarefas));
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
