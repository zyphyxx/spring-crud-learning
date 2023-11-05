package com.zpx.gerenciadorDeTarefas.service;

import com.zpx.gerenciadorDeTarefas.domain.Tarefas;
import com.zpx.gerenciadorDeTarefas.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefasService {

    private final TarefasRepository repository;

    @Autowired
    public TarefasService(TarefasRepository repository) {
        this.repository = repository;
    }

    public Tarefas createTask(Tarefas tarefas) {
        return repository.save(tarefas);
    }

    public List<Tarefas> listTask() {
        return repository.findAll();
    }

    public Optional<Tarefas> findById(Long id) {
        return repository.findById(id);
    }

    public Tarefas updateTask(Tarefas tarefas) {
        return repository.save(tarefas);
    }


    public void deleteTask(Tarefas tarefas) {
        repository.delete(tarefas);
    }

    public void deleteTaskPerId(Long id) {
        repository.deleteById(id);
    }

}
