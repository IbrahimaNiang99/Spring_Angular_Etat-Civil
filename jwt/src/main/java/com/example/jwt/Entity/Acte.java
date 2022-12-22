package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    protected Long numActe;
    protected Date dateDeclaration;
    protected String typeDeclaration;

    public String getTypeDeclaration() {
        return typeDeclaration;
    }

    public void setTypeDeclaration(String typeDeclaration) {
        this.typeDeclaration = typeDeclaration;
    }

    @ManyToOne
    @JoinColumn(name = "centre_id")
    private Centre centre;

    @ManyToOne
    @JoinColumn(name = "jugement_id")
    private Jugement jugement;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="acte")
    private Set<Mention> mentions;

    @ManyToOne
    @JoinColumn(name = "registre_id")
    private Registre registre;
    /*
    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "user_id" )
    private User user;
*/
    @ManyToOne
    @JoinColumn(name = "formationsanitaire_id")
    private Formationsanitaire formationsanitaire;

    public Formationsanitaire getFormationsanitaire() {
        return formationsanitaire;
    }

    public void setFormationsanitaire(Formationsanitaire formationsanitaire) {
        this.formationsanitaire = formationsanitaire;
    }


    public Registre getRegistre() {
        return registre;
    }

    public void setRegistre(Registre registre) {
        this.registre = registre;
    }


    public Jugement getJugement() {
        return jugement;
    }

    public void setJugement(Jugement jugement) {
        this.jugement = jugement;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public Acte(Long id, Long numActe, Date dateDeclaration, String typeDeclaration) {
        this.id = id;
        this.numActe = numActe;
        this.typeDeclaration = typeDeclaration;
        this.dateDeclaration = dateDeclaration;
        //this.user = user;
    }
    public Acte(Long id, Long numActe, Date dateDeclaration, String typeDeclaration, Jugement jugement) {
        this.id = id;
        this.numActe = numActe;
        this.typeDeclaration = typeDeclaration;
        this.dateDeclaration = dateDeclaration;
        this.jugement = jugement;
        //this.user = user;
    }

    public Acte() {

    }

    public Long getNumActe() {
        return numActe;
    }

    public void setNumActe(Long numActe) {
        this.numActe = numActe;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
