package com.zpx.gerenciadorDeTarefas.service;

import com.zpx.gerenciadorDeTarefas.domain.Tarefas;
import com.zpx.gerenciadorDeTarefas.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {

    private final TarefasRepository repository;

    @Autowired
    public TarefasService(TarefasRepository repository) {
        this.repository = repository;
    }

    public void create(Tarefas tarefas) {
        repository.save(tarefas);
    }

    public List<Tarefas> list() {
        return repository.findAll();
    }

    public Tarefas update(Tarefas tarefas) {
        return repository.save(tarefas);
    }

    public void delete(Tarefas tarefas) {
        repository.delete(tarefas);
    }

}
