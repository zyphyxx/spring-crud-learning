package com.zpx.proj_num_1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL)
    private List<Tarefa> tarefas;

}
