package com.example.jwt.Repository;

import com.example.jwt.Entity.Officier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficierRepository extends JpaRepository<Officier, Long> {
}
