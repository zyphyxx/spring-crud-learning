package com.example.services;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository repository;

    public User findById (Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Id não valido"));
    }

    @Transactional
    public User create (User obj){
        return repository.save(obj);
    }

}
