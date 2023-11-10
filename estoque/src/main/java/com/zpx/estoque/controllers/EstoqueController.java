package com.zpx.estoque.controllers;

import com.zpx.estoque.entities.Estoque;
import com.zpx.estoque.repositories.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private final EstoqueRepository repository;
    @Autowired
    public EstoqueController(EstoqueRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void salvar(@RequestBody Estoque produto){
        repository.save(produto);
    }



}
