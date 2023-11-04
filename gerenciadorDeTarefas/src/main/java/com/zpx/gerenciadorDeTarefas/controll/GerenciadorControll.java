package com.zpx.gerenciadorDeTarefas.controll;

import com.zpx.gerenciadorDeTarefas.domain.Tarefas;
import com.zpx.gerenciadorDeTarefas.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class GerenciadorControll {

    private final TarefasService service;

    @Autowired
    public GerenciadorControll(TarefasService service){
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody Tarefas tarefas){
        service.create(tarefas);
    }

    @GetMapping
    public List<Tarefas> list (){
        return service.list();
    }

    @PutMapping
    public Tarefas update (@RequestBody Tarefas tarefas){
        return service.update(tarefas);
    }

    @DeleteMapping
    public void delete(@RequestBody Tarefas tarefas){
        service.delete(tarefas);
    }
}
