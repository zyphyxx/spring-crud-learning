package com.zpx.agendadecontatos.dto;

import com.zpx.agendadecontatos.Entities.Contact;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

    @Getter
    private List<Contact> ContactList = new ArrayList<>();

    private Contact contact;

    public ContactList(Contact contact){
        this.contact = contact;
    }

    public void setContactList(List<Contact> contactList) {
        ContactList = contactList;
    }
}
