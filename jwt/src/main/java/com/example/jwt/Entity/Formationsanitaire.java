package com.example.jwt.Entity;


import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@Entity
public class Formationsanitaire{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String libelle;
    private String codeFormation;
    private String typeFormation;

    @OneToMany( fetch=FetchType.LAZY, mappedBy="formationsanitaire")
    private Set<Acte> actes;

    public Formationsanitaire() {

    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getTypeFormation() {
        return typeFormation;
    }

    public void setTypeFormation(String typeFormation) {
        this.typeFormation = typeFormation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
