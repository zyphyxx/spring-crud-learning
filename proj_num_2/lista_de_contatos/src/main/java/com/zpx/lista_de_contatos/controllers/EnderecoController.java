package com.zpx.lista_de_contatos.controllers;

import com.zpx.lista_de_contatos.entities.Enderecos;
import com.zpx.lista_de_contatos.repositories.EnderecosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecosRepository enderecosRepository;

    @GetMapping
    private ResponseEntity<List<Enderecos>> findAllEnderecos() {
        List<Enderecos> objs = enderecosRepository.findAll();
        return ResponseEntity.ok().body(objs);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Enderecos> findById(@PathVariable Long id) {
        Optional<Enderecos> obj = enderecosRepository.findById(id);
        return ResponseEntity.ok().body(obj.get());
    }

    @PostMapping
    public ResponseEntity<Enderecos> createEndereco(@RequestBody Enderecos obj) {
        Enderecos newObj = enderecosRepository.save(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newObj.getId())
                .toUri();
        return ResponseEntity.created(uri).body(newObj);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEndereco(@RequestBody Enderecos obj, @PathVariable Long id) {
        obj.setId(id);
        enderecosRepository.save(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DeleteEndereco(@PathVariable Long id) {
        enderecosRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
