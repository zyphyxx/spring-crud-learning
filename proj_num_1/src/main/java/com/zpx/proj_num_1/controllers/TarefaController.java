package com.zpx.proj_num_1.controllers;

import com.zpx.proj_num_1.entities.Tarefa;
import com.zpx.proj_num_1.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public List<Tarefa> createTarefa (@RequestBody Tarefa objs){
        return tarefaService.createTarefa(objs);
    }

}
