package com.zpx.lista_de_contatos.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "lista_contatos")
@Data
public class ListaContatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_contatos")
    private Contatos idContatos;


    @OneToOne
    @JoinColumn(name = "id_enderecos")
    private Enderecos idEnderecos;
}
