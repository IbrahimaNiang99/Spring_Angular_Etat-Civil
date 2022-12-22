package com.example.jwt.Service.NaissanceService;

import com.example.jwt.Entity.*;

import java.util.Date;

public interface NaissInterface {

    //Naissance addActeNaiss(Naissance naissance);

    void addNaissance(Long id, Long numActe, Date dateDec, String typeDec,
                      Registre registre,
                      Formationsanitaire formationsanitaire,
                      Declarant declarant,
                      Personne pereEnfant,
                      Personne declare,
                      Personne mereEnfant,
                      Centre centre);

}
