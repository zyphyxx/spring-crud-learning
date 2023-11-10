package com.zpx.estoque.repositories;

import com.zpx.estoque.entities.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstoqueRepository extends JpaRepository <Estoque, Long> {



}
