package com.example.jwt.Dto;

import com.example.jwt.Entity.*;
import lombok.Data;

import java.util.Date;

@Data
public class NaissanceRequest {

    private Long id;
    private Long numActe;
    private Date dateDeclaration;
    private String typeDeclaration;
    private Registre registre;
    private Declarant declarant;
    private Personne declare;
    private Personne pereEnfant;
    private Personne mereEnfant;
    private Jugement jugement;
    private Centre centre;
    private Formationsanitaire formationsanitaire;
}
