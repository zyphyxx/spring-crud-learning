package com.zpx.agendadecontatos.controllers;

import com.zpx.agendadecontatos.entities.Contact;
import com.zpx.agendadecontatos.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/contato")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping
    public ResponseEntity<List<Contact>> findAll() {
        List<Contact> objs = service.findAll();
        return ResponseEntity.ok().body(objs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> findById(@PathVariable Long id){
        Contact obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody Contact obj){
        obj = service.createContact(obj);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateContact (@RequestBody Contact obj,
                                               @PathVariable Long id) {
      service.findById(id);
      service.updateContact(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact (@PathVariable Long id) {
        service.deleteContact(id);
        return ResponseEntity.noContent().build();
    }

}
