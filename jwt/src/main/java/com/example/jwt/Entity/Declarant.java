package com.example.jwt.Entity;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Entity
public class Declarant extends Personne{

    private String degreParental;

    @OneToMany(mappedBy="declarant")
    private Set<Naissance> naissances;

    @OneToMany(mappedBy="declarant")
    private Set<Mariage> mariages;

    @OneToMany(mappedBy="declarant")
    private Set<Deces> deces;

    public Declarant(Long id,
                     String prenom,
                     String nom,
                     String profession,
                     String CNI,
                     String sexe,
                     String adresse,
                     String lieuNaissance,
                     Date dateNaissance,
                     LocalTime heureNaissance,
                     String degreParental) {
        super(id, prenom, nom, profession, CNI, sexe, adresse, lieuNaissance, dateNaissance, heureNaissance);
        this.degreParental = degreParental;
    }

    public Declarant() {

    }

}
