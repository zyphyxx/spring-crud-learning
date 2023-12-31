package com.zpx.lista_de_contatos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "enderecos")
@Getter
@Setter
public class Endereco {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private String cidade;

    private String estado;
}
