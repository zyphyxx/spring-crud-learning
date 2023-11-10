package com.zpx.estoque.service;

import com.zpx.estoque.entities.Estoque;
import com.zpx.estoque.repositories.EstoqueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    EstoqueRepository repository;

    public EstoqueService (EstoqueRepository repository){
        this.repository = repository;
    }

  
}
