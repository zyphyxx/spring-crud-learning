package com.zpx.lista_de_contatos.controllers;

import com.zpx.lista_de_contatos.entities.Contatos;
import com.zpx.lista_de_contatos.services.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/contatos")
public class ContatosController {

    @Autowired
    private ContatosService contatosService;

    @GetMapping
    public ResponseEntity<List<Contatos>> findAll () {
        List<Contatos> getAll = contatosService.findAll();
        return ResponseEntity.ok().body(getAll);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contatos> findById (@PathVariable Long id) {
        Contatos obj = contatosService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Contatos> createContatos (@RequestBody Contatos user) {
        user = contatosService.createContatos(user);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(uri).body(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contatos> updateById (@RequestBody Contatos obj, @PathVariable Long id) {
        obj.setId(id);
        contatosService.updateById(obj);
        return ResponseEntity.noContent().build();
    }
}
