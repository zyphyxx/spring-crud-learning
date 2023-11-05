package com.zpx.gerenciadorDeTarefas.services;

import com.zpx.gerenciadorDeTarefas.entities.Tarefas;
import com.zpx.gerenciadorDeTarefas.repositories.TarefasRepository;
import jakarta.transaction.Transactional;
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

    @Transactional
    public Tarefas createTask(Tarefas tarefas) {
        return repository.save(tarefas);
    }

    public List<Tarefas> listTask() {
        return repository.findAll();
    }

    public Optional<Tarefas> findById(Long id) {
        return repository.findById(id);
    }
    @Transactional
    public Tarefas updateTask(Tarefas tarefas) {
        return repository.save(tarefas);
    }

    @Transactional
    public void deleteTask(Tarefas tarefas) {
        repository.delete(tarefas);
    }
    @Transactional
    public void deleteTaskPerId(Long id) {
        repository.deleteById(id);
    }

}
