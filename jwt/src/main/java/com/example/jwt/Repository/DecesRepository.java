package com.example.jwt.Repository;

import com.example.jwt.Entity.Deces;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DecesRepository extends JpaRepository<Deces, Long> {
    //Deces getDecesByNumActe(Long numActe);

    @Query("SELECT max (numActe) from Deces ")long getLastNumActe();



}
