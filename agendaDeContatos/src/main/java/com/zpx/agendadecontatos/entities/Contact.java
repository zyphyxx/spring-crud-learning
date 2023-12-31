package com.zpx.agendadecontatos.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tb_contato")
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

}
