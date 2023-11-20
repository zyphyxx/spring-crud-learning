package com.zpx.proj_num_1.services;

import com.zpx.proj_num_1.entities.Tarefa;
import com.zpx.proj_num_1.repositories.TarefaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    public Tarefa findById(Long id) {
        Optional<Tarefa> obj = tarefaRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    @Transactional
    public Tarefa createTarefa(Tarefa obj) {
        obj.setUser(obj.getUser());
        return tarefaRepository.save(obj);
    }
    @Transactional
    public void updateTarefa(Tarefa obj) {
        Tarefa exitingTarefa = findById(obj.getId());

        exitingTarefa.setTitulo(obj.getTitulo());
        exitingTarefa.setDescricao(obj.getDescricao());
        exitingTarefa.setValidade(obj.getValidade());
        exitingTarefa.setUser(obj.getUser());

        tarefaRepository.save(exitingTarefa);
    }


}
