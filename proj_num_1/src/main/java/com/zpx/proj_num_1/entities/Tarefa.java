package com.zpx.proj_num_1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "tb_tarefa")
@Data
public class Tarefa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String validade;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @ManyToOne
    private Categoria categoria;

}
