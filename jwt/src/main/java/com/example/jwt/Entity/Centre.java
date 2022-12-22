package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@Entity
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String codeCentre;
    private String collectiviteLocale;
    private String departement;
    private String libelle;
    private String region;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="centre")
    private Set<Acte> actes;

    public Centre() {

    }

    public String getCodeCentre() {
        return codeCentre;
    }

    public void setCodeCentre(String codeCentre) {
        this.codeCentre = codeCentre;
    }

    public String getCollectiviteLocale() {
        return collectiviteLocale;
    }

    public void setCollectiviteLocale(String collectiviteLocale) {
        this.collectiviteLocale = collectiviteLocale;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
