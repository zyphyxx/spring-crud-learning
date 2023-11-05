package com.zpx.gerenciadorDeTarefas.entities;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "gerenciador_de_tarefas")
@ApiModel(description = "Entidade de Tarefas")
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID da tarefa")
    private Long id;

    @ApiModelProperty(value = "Detalhes da tarefa")
    private String detalhes;

    @ApiModelProperty(value = "Data de vencimento da tarefa")
    private LocalDate vencimento;

    @ApiModelProperty(value = "Categoria da tarefa")
    private String categoria;

}
