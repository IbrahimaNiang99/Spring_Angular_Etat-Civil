package com.example.jwt.Repository;

import com.example.jwt.Entity.Naissance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NaissanceRepository extends JpaRepository<Naissance, Long> {
    @Query("SELECT max (numActe)  from Naissance")
    long getLastNumActe();
/*
  @Query("SELECT max (numActe)  from Naissance where registre.id = ?1 ")
    long getLastNumActe(int id);
 */


}
