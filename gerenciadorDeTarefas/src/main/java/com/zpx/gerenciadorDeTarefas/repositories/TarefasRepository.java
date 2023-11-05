package com.zpx.gerenciadorDeTarefas.repositories;

import com.zpx.gerenciadorDeTarefas.entities.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long> {
}
