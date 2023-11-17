package com.zpx.agendadecontatos.repositories;

import com.zpx.agendadecontatos.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmailRepository extends JpaRepository <Email, Long> {


    Optional<Email> findEnderecoById(Long id);



    Email createEndereco(Email obj);

    List<Email> findAllEndereco();

}
