package com.zpx.agendadecontatos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;


@Getter
@Entity
@Table(name = "tb_contact")
public class Contact {

    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "phonenumber")
    private String phoneNumber;
    @Column (name = "email")
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contact() {
    }

    public Contact(Contact contacts) {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
