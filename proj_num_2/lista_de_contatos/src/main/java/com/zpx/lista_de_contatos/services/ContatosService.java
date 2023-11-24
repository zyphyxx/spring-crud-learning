package com.zpx.lista_de_contatos.services;

import com.zpx.lista_de_contatos.entities.Contatos;
import com.zpx.lista_de_contatos.repositories.ContatosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {

    @Autowired
    private ContatosRepository contatosRepository;

    public List<Contatos> findAll () {
        return contatosRepository.findAll();
    }

    public Contatos findById (Long id){
        Optional<Contatos> obj = contatosRepository.findById(id);
       return obj.orElseThrow(() -> new RuntimeException("Contato não encontrada"));
    }

    @Transactional
    public Contatos createContatos (Contatos user) {
        return contatosRepository.save(user);
    }

    @Transactional
    public void updateById (Contatos obj) {
        Contatos newObj = findById(obj.getId());
        newObj.setNome(obj.getNome());
        newObj.setEmail(obj.getEmail());
        newObj.setNumeroCel(obj.getNumeroCel());
         contatosRepository.save(newObj);
    }
    @Transactional
    public void deleteContatos (Long id){
       Contatos obj = findById(id);
       contatosRepository.deleteById(obj.getId());
    }

}
