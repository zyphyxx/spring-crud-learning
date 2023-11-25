package com.zpx.lista_de_contatos.controllers;

import com.zpx.lista_de_contatos.entities.Contatos;
import com.zpx.lista_de_contatos.entities.Enderecos;
import com.zpx.lista_de_contatos.services.ListaContatosService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lista")
public class ListaContatosController {

    @Autowired
    private ListaContatosService listaContatosService;

    @GetMapping
    public List<Contatos> findAllContacts (){
        return listaContatosService.findAllContacts();
    }

    @GetMapping
    public List<Enderecos> findAllEnderecos (){
        return listaContatosService.findAllEnderecos();
    }



}
