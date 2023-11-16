package com.zpx.agendadecontatos.services;

import com.zpx.agendadecontatos.entities.Contact;
import com.zpx.agendadecontatos.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public List<Contact> findAll() {
        return repository.findAll();
    }

    public Contact findById(Long id) {
        Optional<Contact> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Usuario não encontrado: " + id));
    }

    public Contact createContact(Contact obj) {
        return repository.save(obj);
    }

    public void updateContact (Contact obj){
        Contact newObj = findById(obj.getId());
        repository.save(newObj);
    }

    public void deleteContact (Long id) {
        Contact obj = findById(id);
        repository.delete(obj);
    }
}
