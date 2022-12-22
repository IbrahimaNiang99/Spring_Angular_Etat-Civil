package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Entity
public class Mention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String apposition;
    private String libelle;
    private String reference;

    @ManyToOne
    @JoinColumn(name = "acte_id")
    private Acte acte;

    public Acte getActe() {
        return acte;
    }

    public void setActe(Acte acte) {
        this.acte = acte;
    }


    public Mention() {

    }

    public String getApposition() {
        return apposition;
    }

    public void setApposition(String apposition) {
        this.apposition = apposition;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
