package com.zpx.estoque.controllers;

import com.zpx.estoque.entities.Estoque;
import com.zpx.estoque.repositories.EstoqueRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
     private EstoqueRepository repository;

    @PostMapping
    @Transactional
    public void salvar (@RequestBody Estoque produto){
        repository.save(produto);
    }

    @GetMapping
    public List<Estoque> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Estoque> findbyid(@PathVariable Long id){
        return repository.findById(id);
    }

    @PutMapping
    @Transactional
    public void atualizarId (@RequestBody Long id){
        var x  = findbyid(id);
        


    }

}
