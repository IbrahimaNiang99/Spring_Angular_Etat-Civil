package com.example.jwt.Repository;

import com.example.jwt.Entity.Mariage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MariageRepository extends JpaRepository<Mariage, Long> {

    @Query("SELECT max (numActe) from Mariage ")long getLastNumActe();
}
