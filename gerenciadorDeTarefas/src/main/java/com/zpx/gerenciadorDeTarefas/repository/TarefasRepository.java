package com.zpx.gerenciadorDeTarefas.repository;

import com.zpx.gerenciadorDeTarefas.domain.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long> {
}
