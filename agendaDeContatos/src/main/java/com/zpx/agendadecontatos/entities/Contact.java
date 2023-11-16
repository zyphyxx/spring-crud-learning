package com.zpx.agendadecontatos.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tb_contact")
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column (name = "email")
    private String email;

}
