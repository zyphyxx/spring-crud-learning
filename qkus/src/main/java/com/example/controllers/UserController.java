package com.example.controllers;

import com.example.entities.User;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById (@PathVariable Long id){
        User obj = service.findById(id);
       return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Void> create (@RequestBody User obj){
        User newObj = service.create(obj);
        URI uri = URI.create("/user");
        return ResponseEntity.created(uri).build();
    }
}
