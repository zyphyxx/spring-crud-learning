package com.zpx.lista_de_contatos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "enderecos")
@Data
public class Enderecos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua")
    private String rua;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;
}
