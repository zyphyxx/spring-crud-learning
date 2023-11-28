package com.zpx.lista_de_contatos.controllers;

import com.zpx.lista_de_contatos.entities.Usuario;
import com.zpx.lista_de_contatos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> findAll () {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario createUser (@RequestBody Usuario obj) {
        return usuarioRepository.save(obj);
    }

}
