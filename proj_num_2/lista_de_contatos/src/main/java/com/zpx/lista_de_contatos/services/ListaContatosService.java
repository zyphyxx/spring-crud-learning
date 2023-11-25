package com.zpx.lista_de_contatos.services;


import com.zpx.lista_de_contatos.entities.Contatos;
import com.zpx.lista_de_contatos.entities.Enderecos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ListaContatosService {

    @Autowired
    public ContatosService contatosService;

    @Autowired
    public EnderecosService enderecosService;

    public List<Contatos> findAllContacts () {
        return contatosService.findAll();
    }

    public List<Enderecos> findAllEnderecos () {
        return enderecosService.findAllEnderecos();
    }
}
