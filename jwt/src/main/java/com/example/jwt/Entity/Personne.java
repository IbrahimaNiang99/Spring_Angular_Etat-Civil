package com.example.jwt.Entity;
import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    protected String prenom, nom, profession, CNI, sexe, adresse, lieuNaissance;
    protected Date dateNaissance;
    protected LocalTime heureNaissance;

    @OneToOne(mappedBy = "defunt")
    private Deces defunt;

    @OneToOne(mappedBy = "pere")
    private Deces pere;

    @OneToOne(mappedBy = "mere")
    private Deces mere;

    @OneToOne(mappedBy = "declare")
    private Naissance naissance;

    @OneToMany(mappedBy="pereEnfant")
    private Set<Naissance> pereEnfant;

    @OneToMany(mappedBy="mereEnfant")
    private Set<Naissance> mereEnfant;

    @OneToMany(mappedBy="epoux")
    private Set<Mariage> epoux;

    @OneToMany(mappedBy="epouse")
    private Set<Mariage> epouse;

    @OneToMany(mappedBy="pereEpoux")
    private Set<Mariage> pereEpoux;

    @OneToMany(mappedBy="mereEpoux")
    private Set<Mariage> mereEpoux;

    @OneToMany(mappedBy="pereEpouse")
    private Set<Mariage> pereEpouse;

    @OneToMany(mappedBy="mereEpouse")
    private Set<Mariage> mereEpouse;

      public Personne(Long id, String prenom, String nom, String profession, String CNI, String sexe, String adresse, String lieuNaissance, Date dateNaissance, LocalTime heureNaissance) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.profession = profession;
        this.CNI = CNI;
        this.sexe = sexe;
        this.adresse = adresse;
        this.lieuNaissance = lieuNaissance;
        this.dateNaissance = dateNaissance;
        this.heureNaissance = heureNaissance;
    }

    public Personne(Long id, String prenom, String nom, String CNI, String adresse, Date dateNaissance, LocalTime heureNaissance) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.CNI = CNI;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.heureNaissance = heureNaissance;
    }


    public Personne() {

    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCNI() {
        return CNI;
    }

    public void setCNI(String CNI) {
        this.CNI = CNI;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public LocalTime getHeureNaissance() {
        return heureNaissance;
    }

    public void setHeureNaissance(LocalTime heureNaissance) {
        this.heureNaissance = heureNaissance;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
