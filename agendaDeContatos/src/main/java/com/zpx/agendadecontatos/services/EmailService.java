package com.zpx.agendadecontatos.services;

import com.zpx.agendadecontatos.entities.Email;
import com.zpx.agendadecontatos.repositories.EmailRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailService;


    public Optional<Email>  findEnderecoById (Long id){
      return emailService.findEnderecoById(id);
    }

    public List<Email> findAllEndereco (){
        return emailService.findAllEndereco();
    }

    @Transactional
    public Email createEndereco (Email obj){
        obj = emailService.createEndereco(obj);
        return obj;
    }

}
