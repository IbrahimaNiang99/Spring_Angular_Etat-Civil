package com.example.jwt.Entity;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@AllArgsConstructor
@Entity
public class Jugement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long numJugement;
    private Date dateJugement;
    private String lieuJugement;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="jugement")
    private Set<Acte> actes;



    public Jugement() {

    }

    public Long getNumJugement() {
        return numJugement;
    }

    public void setNumJugement(Long numJugement) {
        this.numJugement = numJugement;
    }

    public Date getDateJugement() {
        return dateJugement;
    }

    public void setDateJugement(Date dateJugement) {
        this.dateJugement = dateJugement;
    }

    public String getLieuJugement() {
        return lieuJugement;
    }

    public void setLieuJugement(String lieuJugement) {
        this.lieuJugement = lieuJugement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
