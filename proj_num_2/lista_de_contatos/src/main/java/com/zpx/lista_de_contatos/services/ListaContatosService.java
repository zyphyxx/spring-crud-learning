package com.zpx.lista_de_contatos.services;

import com.zpx.lista_de_contatos.entities.ListaContatos;
import com.zpx.lista_de_contatos.repositories.ListaContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaContatosService {

    @Autowired
    private ListaContatosRepository listaContatosRepository;

    public List<ListaContatos> findAll () {
        return listaContatosRepository.findAll();
    }
}
