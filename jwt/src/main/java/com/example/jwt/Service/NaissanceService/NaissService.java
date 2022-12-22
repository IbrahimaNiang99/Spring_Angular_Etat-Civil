package com.example.jwt.Service.NaissanceService;

import com.example.jwt.Entity.*;
import com.example.jwt.Repository.*;
import lombok.Data;

import java.util.Date;

public class NaissService {
    private ActeRepository acteRepository;
    private RegistreRepository registreRepository;


    public void addNaissance(Long id, Long numActe, Date dateDec, String typeDec,
                             Registre registre, Formationsanitaire formationsanitaire,
                             Declarant declarant, Personne pereEnfant, Personne declare,
                             Personne mereEnfant, Centre centre, Jugement jugement) {
        Naissance naissance = new Naissance(id, numActe, dateDec, declare, declarant, pereEnfant, mereEnfant, typeDec, jugement, registre, formationsanitaire, centre);
    }

}
