package com.zpx.proj_num_1.services;

import com.zpx.proj_num_1.entities.Tarefa;
import com.zpx.proj_num_1.repositories.TarefaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findAll () {
        return tarefaRepository.findAll();
    }

    public Tarefa findById (Long id) {
        Optional<Tarefa> obj = Optional.ofNullable(findById(id));
        return obj.orElseThrow(() -> new RuntimeException("Usuario ou Tarefa não encontrada"));
    }

    @Transactional
    public List<Tarefa> createTarefa (Tarefa objs) {
        List<Tarefa> newObjs = new ArrayList<>();
        newObjs.add(objs);
        return tarefaRepository.saveAll(newObjs);
    }

    public Tarefa updateTarefa (Tarefa obj) {
        Tarefa newObj = findById(obj.getId());
        return tarefaRepository.save(newObj);
    }



}
