package com.zpx.proj_num_1.services;

import com.zpx.proj_num_1.entities.Tarefa;
import com.zpx.proj_num_1.repositories.TarefaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    @Transactional
    public List<Tarefa> createTarefa (Tarefa objs) {
        List<Tarefa> newObjs = new ArrayList<>();
        newObjs.add(objs);
        return tarefaRepository.saveAll(newObjs);
    }

}
