package com.zpx.lista_de_contatos.controllers;

import com.zpx.lista_de_contatos.entities.Endereco;
import com.zpx.lista_de_contatos.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping
    private List<Endereco> findAll () {
        return enderecoRepository.findAll();
    }

    @PostMapping
    private Endereco createEndereco (@RequestBody Endereco obj) {
        return enderecoRepository.save(obj);
    }

}
