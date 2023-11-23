package com.zpx.lista_de_contatos.repositories;

import com.zpx.lista_de_contatos.entities.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecosRepository extends JpaRepository<Enderecos , Long> {
    
}
