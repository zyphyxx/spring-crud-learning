package com.zpx.lista_de_contatos.repositories;

import com.zpx.lista_de_contatos.entities.Contatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Long> {
}
