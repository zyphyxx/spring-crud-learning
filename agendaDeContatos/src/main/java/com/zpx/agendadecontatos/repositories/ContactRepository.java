package com.zpx.agendadecontatos.repositories;

import com.zpx.agendadecontatos.Entities.Contact;

import com.zpx.agendadecontatos.dto.ContactList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository <Contact,Long> {


    ContactList save(List<Contact> x);
}
