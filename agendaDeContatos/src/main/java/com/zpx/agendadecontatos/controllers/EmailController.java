package com.zpx.agendadecontatos.controllers;

import com.zpx.agendadecontatos.entities.Email;
import com.zpx.agendadecontatos.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("contato/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping
    public ResponseEntity<List<Email>> findAllEndereco (){
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Email> createEndereco (@RequestBody Email obj){
        Email newObj = emailService.createEndereco(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/emails")
                .buildAndExpand(newObj.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
