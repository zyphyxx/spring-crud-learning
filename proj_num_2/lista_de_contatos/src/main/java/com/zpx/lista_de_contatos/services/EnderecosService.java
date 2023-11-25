package com.zpx.lista_de_contatos.services;

import com.zpx.lista_de_contatos.entities.Enderecos;
import com.zpx.lista_de_contatos.repositories.EnderecosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecosService {

    @Autowired
    private EnderecosRepository enderecosRepository;

    public List<Enderecos> findAllEnderecos() {
        return enderecosRepository.findAll();
    }

    public Enderecos findById(Long id) {
        Optional<Enderecos> obj = enderecosRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Endereço não encontrado"));
    }

    @Transactional
    public Enderecos createEndereco(Enderecos obj) {
        return enderecosRepository.save(obj);
    }

    @Transactional
    public void updateEndereco(Enderecos obj) {
        obj = findById(obj.getId());
        obj.setRua(obj.getRua());
        obj.setCidade(obj.getCidade());
        obj.setEstado(obj.getEstado());
        enderecosRepository.save(obj);
    }

    @Transactional
    public void DeleteEndereco(@PathVariable Long id) {
        Enderecos obj = findById(id);
        enderecosRepository.deleteById(obj.getId());
    }

}
