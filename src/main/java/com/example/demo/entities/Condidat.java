package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Condidat extends Personne {
    private String formation;
    private Integer experience;

    @OneToMany
    @JsonIgnore
    private Collection<Contact>contacts=new ArrayList<>();



    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }


    public Condidat(Long id, String nom, String prenom, String login, String password, String formation, Integer experience) {
        super(id, nom, prenom, login, password);
        this.formation = formation;
        this.experience = experience;
    }



    public Condidat() {
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<Contact> contacts) {
        this.contacts = contacts;
    }
}
