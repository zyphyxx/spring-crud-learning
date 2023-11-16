package com.zpx.agendadecontatos.repositories;

import com.zpx.agendadecontatos.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository <Email, Long> {
}
