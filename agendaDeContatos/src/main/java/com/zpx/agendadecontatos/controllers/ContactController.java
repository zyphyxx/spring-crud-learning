package com.zpx.agendadecontatos.controllers;

import com.zpx.agendadecontatos.entities.Contact;
import com.zpx.agendadecontatos.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactRepository repository;

    @PostMapping
    public void myContacts (@RequestBody Contact contact){
        var x = new Contact(contact);
       repository.save(x);
    }










}
