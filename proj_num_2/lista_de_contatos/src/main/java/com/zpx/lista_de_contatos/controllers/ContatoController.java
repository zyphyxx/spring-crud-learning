package com.zpx.lista_de_contatos.controllers;

import com.zpx.lista_de_contatos.entities.Contato;
import com.zpx.lista_de_contatos.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario/contato")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping
    public List<Contato> findAll () {
        return contatoRepository.findAll();
    }

    @PostMapping
    public Contato createContato (@RequestBody Contato obj) {
        return contatoRepository.save(obj);
    }



}
