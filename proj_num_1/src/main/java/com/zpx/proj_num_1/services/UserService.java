package com.zpx.proj_num_1.services;

import com.zpx.proj_num_1.entities.User;
import com.zpx.proj_num_1.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Usuario não encontrado " + id));
    }

    @Transactional
    public User createUser(User obj) {
        obj = userRepository.save(obj);
        return obj;
    }

    public void updateUser(Long id) {
        Optional<User> obj = userRepository.findById(id);
        if (obj.isPresent()) {
            userRepository.save(obj.get());
        } else obj.orElseThrow(() -> new RuntimeException("Não foi possivel atualizar o usuario: " + id));
    }

    public void deleteUser(Long id) {
        Optional<User> obj = userRepository.findById(id);
        userRepository.delete(obj.get());
    }

}



