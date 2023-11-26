package com.zpx.lista_de_contatos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne
    @JoinColumn(name = "contatos_us",referencedColumnName = "id")
    private Contato contato;

    @OneToOne
    @JoinColumn(name = "enderecos_us",referencedColumnName = "id")
    private Endereco endereco;
}
