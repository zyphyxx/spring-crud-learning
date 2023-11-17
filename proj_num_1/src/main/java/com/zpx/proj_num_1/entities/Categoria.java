package com.zpx.proj_num_1.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table (name = "tb_categoria")
@Data
public class Categoria {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn (name = "tarefa_id")
    private Tarefa tarefa;
}
