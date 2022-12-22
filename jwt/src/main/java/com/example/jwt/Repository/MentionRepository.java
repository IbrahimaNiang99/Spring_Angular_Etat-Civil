package com.example.jwt.Repository;

import com.example.jwt.Entity.Mention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentionRepository extends JpaRepository<Mention, Long> {
}
