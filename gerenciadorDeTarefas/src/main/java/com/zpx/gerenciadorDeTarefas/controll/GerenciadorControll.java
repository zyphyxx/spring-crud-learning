package com.zpx.gerenciadorDeTarefas.controll;

import com.zpx.gerenciadorDeTarefas.domain.Tarefas;
import com.zpx.gerenciadorDeTarefas.service.TarefasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
@Api(value = "Gerenciador de Tarefas")
@CrossOrigin(origins = "*")
public class GerenciadorControll {

    private final TarefasService service;

    @Autowired
    public GerenciadorControll(TarefasService service){
        this.service = service;
    }

    @PostMapping
    @ApiOperation(value = "Cria um item na lista de tarefas")
    public void create(@RequestBody Tarefas tarefas){
        service.create(tarefas);
    }

    @GetMapping
    @ApiOperation(value = " lista as tarefas")
    public List<Tarefas> list (){
        return service.list();
    }

    @PutMapping
    @ApiOperation(value = "atualiza as tarefas")
    public Tarefas update (@RequestBody Tarefas tarefas){
        return service.update(tarefas);
    }

    @DeleteMapping
    @ApiOperation(value = "apaga uma tarefa")
    public void delete(@RequestBody Tarefas tarefas){
        service.delete(tarefas);
    }
}
