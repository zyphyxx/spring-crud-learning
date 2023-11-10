package com.zpx.estoque.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tb_estoque")
@Data
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;



}
