package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Entity
public class Mariage extends Acte{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String optionMariage;
    private String regimeMariage;
    private Long montantDot;
    private String coutume;
    private String lieuMariage;

    private Date dateMariage;


    @ManyToOne
    @JoinColumn(name = "declarant_id")
    private Declarant declarant;

    @ManyToOne
    @JoinColumn(name = "epoux_id")
    private Personne epoux;

    @ManyToOne
    @JoinColumn(name = "epouse_id")
    private Personne epouse;

    @ManyToOne
    @JoinColumn(name = "pere_epoux_id")
    private Personne pereEpoux;

    @ManyToOne
    @JoinColumn(name = "mere_epoux_id")
    private Personne mereEpoux;

    @ManyToOne
    @JoinColumn(name = "pere_epouse_id")
    private Personne pereEpouse;

    @ManyToOne
    @JoinColumn(name = "mere_epouse_id")
    private Personne mereEpouse;

    @ManyToOne
    @JoinColumn(name = "temoin_1_id")
    private Temoin temoin1;

    @ManyToOne
    @JoinColumn(name = "temoin_id")
    private Temoin temoin;

    public Temoin getTemoin() {
        return temoin;
    }

    public void setTemoin(Temoin temoin) {
        this.temoin = temoin;
    }

    public Temoin getTemoin1() {
        return temoin1;
    }

    public void setTemoin1(Temoin temoin1) {
        this.temoin1 = temoin1;
    }

    public Personne getMereEpouse() {
        return mereEpouse;
    }

    public void setMereEpouse(Personne mereEpouse) {
        this.mereEpouse = mereEpouse;
    }

    public Personne getPereEpouse() {
        return pereEpouse;
    }

    public void setPereEpouse(Personne pereEpouse) {
        this.pereEpouse = pereEpouse;
    }

    public Personne getMereEpoux() {
        return mereEpoux;
    }

    public void setMereEpoux(Personne mereEpoux) {
        this.mereEpoux = mereEpoux;
    }

    public Personne getPereEpoux() {
        return pereEpoux;
    }

    public void setPereEpoux(Personne pereEpoux) {
        this.pereEpoux = pereEpoux;
    }

    public Personne getEpouse() {
        return epouse;
    }

    public void setEpouse(Personne epouse) {
        this.epouse = epouse;
    }

    public Personne getEpoux() {
        return epoux;
    }


    public void setEpoux(Personne epoux) {
        this.epoux = epoux;
    }

    public Mariage(Long id, Long numActe, Date dateDeclaration, Declarant declarant, Date dateMariage,String typeDeclaration,
                   String optionMariage, String regimeMariage, Long montantDot, String coutume,
                   Temoin temoin, Temoin temoin1, Personne epoux, Personne epouse, Personne mereEpouse, Personne pereEpouse,
                   Personne pereEpoux, Personne mereEpoux, String lieuMariage) {
        super(id, numActe, dateDeclaration, typeDeclaration);
        this.epouse = epouse;
        this.epoux = epoux;
        this.dateMariage = dateMariage;
        this.mereEpoux = mereEpoux;
        this.mereEpouse = mereEpouse;
        this.pereEpouse = pereEpouse;
        this.pereEpoux = pereEpoux;
        this.lieuMariage = lieuMariage;
        this.temoin = temoin;
        this.temoin1 = temoin1;
        this.declarant = declarant;
        this.optionMariage = optionMariage;
        this.regimeMariage = regimeMariage;
        this.coutume = coutume;
        this.montantDot = montantDot;
    }

    public Mariage() {

    }

    public String getLieuMariage() {
        return lieuMariage;
    }

    public void setLieuMariage(String lieuMariage) {
        this.lieuMariage = lieuMariage;
    }

    public Date getDateMariage() {
        return dateMariage;
    }

    public void setDateMariage(Date dateMariage) {
        this.dateMariage = dateMariage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionMariage() {
        return optionMariage;
    }

    public void setOptionMariage(String optionMariage) {
        this.optionMariage = optionMariage;
    }

    public String getRegimeMariage() {
        return regimeMariage;
    }

    public void setRegimeMariage(String regimeMariage) {
        this.regimeMariage = regimeMariage;
    }

    public Long getMontantDot() {
        return montantDot;
    }

    public void setMontantDot(Long montantDot) {
        this.montantDot = montantDot;
    }

    public String getCoutume() {
        return coutume;
    }

    public void setCoutume(String coutume) {
        this.coutume = coutume;
    }

    public Declarant getDeclarant() {
        return declarant;
    }

    public void setDeclarant(Declarant declarant) {
        this.declarant = declarant;
    }
}
