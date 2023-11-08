package com.zpx.agendadecontatos.services;

import com.zpx.agendadecontatos.Entities.Contact;
import com.zpx.agendadecontatos.dto.ContactList;
import com.zpx.agendadecontatos.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    final private ContactRepository repository;

    @Autowired
    ContactService(ContactRepository repository){
        this.repository = repository;
    }

    ContactList contactList;

    public ContactList CreateContact (Contact contact){
        contactList = new ContactList(contact);
        var x = contactList.getContactList();
        return repository.save(x);
    }

}
