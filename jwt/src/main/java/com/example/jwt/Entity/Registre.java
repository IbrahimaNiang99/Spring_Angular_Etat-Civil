package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.Year;
import java.util.Set;

@AllArgsConstructor
@Entity
public class Registre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Long annee;

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }


    @OneToMany(fetch=FetchType.LAZY, mappedBy="registre")
    private Set<Acte> actes;

    public Registre() {

    }
    public Registre(Long id) {
        this.id = id;
    }
    public Registre(Long id, Long annee) {
        this.id = id;
        this.annee = annee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
