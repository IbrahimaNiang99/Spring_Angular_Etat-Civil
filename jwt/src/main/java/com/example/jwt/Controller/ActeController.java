package com.example.jwt.Controller;

import com.example.jwt.Entity.Acte;
import com.example.jwt.Entity.Temoin;
import com.example.jwt.Repository.ActeRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/acte")
public class ActeController {

    private final ActeRepository acteRepository;


    public ActeController(ActeRepository acteRepository) {
        this.acteRepository = acteRepository;
    }

    @GetMapping("/list")
    public List<Acte> list() {
        return this.acteRepository.findAll();
    }


}
