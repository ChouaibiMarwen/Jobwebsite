package com.example.demo.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Long duree;
    private String localisation;
    private String datepublication;
    private String datelimite;
    private String specialite;
    private String mission;
    private Long experience;
    @ManyToOne
    @JoinColumn(name="Rec_id")
    private Recruteur r;


    public Recruteur getR() {
        return r;
    }

    public void setR(Recruteur r) {
        this.r = r;
    }

    public Offre() {
    }

    public Offre(Long id, String type, Long duree, String localisation, String datepublication, String datelimite, String specialite, String mission, Long experience) {
        this.id = id;
        this.type = type;
        this.duree = duree;
        this.localisation = localisation;
        this.datepublication = datepublication;
        this.datelimite = datelimite;
        this.specialite = specialite;
        this.mission = mission;
        this.experience = experience;
    }

    public String getType() {
        return type;
    }

    public Long getDuree() {
        return duree;
    }

    public String getLocalisation() {
        return localisation;
    }

    public String getDatePublication() {
        return datepublication;
    }

    public String getDateLimite() {
        return datelimite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public String getMission() {
        return mission;
    }

    public Long getExperience() {
        return experience;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDuree(Long duree) {
        this.duree = duree;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setDatePublication(String datePublication) {
        this.datepublication = datePublication;
    }

    public void setDateLimite(String dateLimite) {
        this.datelimite = dateLimite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
