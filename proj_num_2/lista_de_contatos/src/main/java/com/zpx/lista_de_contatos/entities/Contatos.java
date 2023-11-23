package com.zpx.lista_de_contatos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "contatos")
@Data
public class Contatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "numero_cel")
    private String numeroCel;


}
