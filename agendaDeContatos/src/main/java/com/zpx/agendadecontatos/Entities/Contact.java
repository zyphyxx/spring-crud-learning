package com.zpx.agendadecontatos.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "tb_contact")
public class Contact {

    @Id
    private Long id;
    private String name;
    private Integer phoneNumber;
    private String email;

    public Contact(Long id,String name,Integer phoneNumber, String email){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Contact(){}

}
