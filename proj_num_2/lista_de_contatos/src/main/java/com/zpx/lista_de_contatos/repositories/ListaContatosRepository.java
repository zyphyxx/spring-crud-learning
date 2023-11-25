package com.zpx.lista_de_contatos.repositories;


import com.zpx.lista_de_contatos.entities.ListaContatos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ListaContatosRepository extends JpaRepository<ListaContatos, Long> {

}
