package com.example.jwt.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Deces extends Acte{
    private Date dateDeces;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pere_id", referencedColumnName = "id")
    private Personne pere;

    @OneToOne(orphanRemoval = false)
    @JoinColumn(name = "mere_id",referencedColumnName = "id")
    private Personne mere;

    @ManyToOne
    @JoinColumn(name = "declarant_id")
    private Declarant declarant;

    @OneToOne(orphanRemoval = true)
    @JoinTable(name = "defunt",
            joinColumns = @JoinColumn(name = "deces_id"),
            inverseJoinColumns = @JoinColumn(name = "personne_id"))
    private Personne defunt;

    public Personne getDefunt() {
        return defunt;
    }

    public void setDefunt(Personne defunt) {
        this.defunt = defunt;
    }

    public Deces(Long id,String typeDeclaration, Long numActe, Date dateDeclaration, Date dateDeces,Personne pere, Personne mere, Declarant declarant, Personne defunt) {
        super(id, numActe, dateDeclaration, typeDeclaration);
        this.dateDeces = dateDeces;
        this.mere = mere;
        this.pere = pere;
        this.defunt = defunt;
        this.declarant = declarant;
    }

    public Date getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(Date dateDeces) {
        this.dateDeces = dateDeces;
    }

    public Personne getPere() {
        return pere;
    }

    public void setPere(Personne pere) {
        this.pere = pere;
    }

    public Declarant getDeclarant() {
        return declarant;
    }

    public void setDeclarant(Declarant declarant) {
        this.declarant = declarant;
    }

    public Personne getMere() {
        return mere;
    }

    public void setMere(Personne mere) {
        this.mere = mere;
    }

    public Personne getPersonne() {
        return pere;
    }

    public void setPersonne(Personne personne) {
        this.pere = personne;
    }



    public Deces() {
        //super();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
