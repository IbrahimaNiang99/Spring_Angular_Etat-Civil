package com.example.jwt.Repository;

import com.example.jwt.Entity.Acte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeRepository extends JpaRepository<Acte, Long> {
}
