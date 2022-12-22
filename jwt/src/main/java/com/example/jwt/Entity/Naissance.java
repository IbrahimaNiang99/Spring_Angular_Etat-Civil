package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Naissance extends Acte{

    @ManyToOne
    @JoinColumn(name = "declarant_id")
    private Declarant declarant;
    @ManyToOne
    @JoinColumn(name = "pere_enfant_id")
    private Personne pereEnfant;

    @ManyToOne
    @JoinColumn(name = "mere_enfant_id")
    private Personne mereEnfant;
    @OneToOne(orphanRemoval = true)
    @JoinTable(name = "declare",
            joinColumns = @JoinColumn(name = "naissance_id"),
            inverseJoinColumns = @JoinColumn(name = "personne_id"))
    private Personne declare;


    public Naissance() {

    }

    public Naissance(Long id, Long numActe, Date dateDeclaration,Personne declare,
                     Declarant declarant, Personne pereEnfant, Personne mereEnfant,String typeDeclaration) {
        super(id, numActe, dateDeclaration, typeDeclaration);
        this.declarant = declarant;
        this.declare = declare;
        this.mereEnfant = mereEnfant;
        this.pereEnfant = pereEnfant;
    }

    public Naissance(Long id, Long numActe, Date dateDec, Personne declare, Declarant declarant, Personne pereEnfant, Personne mereEnfant, String typeDec, Jugement jugement, Registre registre, Formationsanitaire formationsanitaire, Centre centre) {
        super(id, numActe, dateDec, typeDec, jugement);
        this.declarant = declarant;
        this.declare = declare;
        this.mereEnfant = mereEnfant;
        this.pereEnfant = pereEnfant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personne getMereEnfant() {
        return mereEnfant;
    }

    public void setMereEnfant(Personne mereEnfant) {
        this.mereEnfant = mereEnfant;
    }

    public Personne getPereEnfant() {
        return pereEnfant;
    }

    public void setPereEnfant(Personne pereEnfant) {
        this.pereEnfant = pereEnfant;
    }



    public Declarant getDeclarant() {
        return declarant;
    }

    public void setDeclarant(Declarant declarant) {
        this.declarant = declarant;
    }

    public Personne getDeclare() {
        return declare;
    }

    public void setDeclare(Personne declare) {
        this.declare = declare;
    }


}
