package com.zpx.agendadecontatos.controllers;

import com.zpx.agendadecontatos.Entities.Contact;
import com.zpx.agendadecontatos.dto.ContactList;
import com.zpx.agendadecontatos.services.ContactService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lista")
public class ContactController {

    private ContactService service;

    @Transactional
    @PostMapping
    public ContactList CreateContact (@RequestBody Contact contact){
        return service.CreateContact(contact);
    }

}
