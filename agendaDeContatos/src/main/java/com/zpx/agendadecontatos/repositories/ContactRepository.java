package com.zpx.agendadecontatos.repositories;

import com.zpx.agendadecontatos.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository <Contact, Long> {
}
