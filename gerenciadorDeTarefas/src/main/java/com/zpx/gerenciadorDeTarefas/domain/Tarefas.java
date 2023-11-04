package com.zpx.gerenciadorDeTarefas.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "gerenciador_de_tarefas")
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detalhes;
    private LocalDate vencimento;
    private String categoria;

}
