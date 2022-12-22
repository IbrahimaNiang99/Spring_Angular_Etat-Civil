package com.example.jwt.Repository;

import com.example.jwt.Entity.Jugement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugementRepository extends JpaRepository<Jugement, Long> {
}
