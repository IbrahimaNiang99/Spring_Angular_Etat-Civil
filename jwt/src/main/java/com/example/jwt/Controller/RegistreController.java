package com.example.jwt.Controller;

import com.example.jwt.Entity.Registre;
import com.example.jwt.Repository.RegistreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registre")
public class RegistreController {

    private final RegistreRepository registreRepository;


    public RegistreController(RegistreRepository registreRepository) {
        this.registreRepository = registreRepository;
    }


    @GetMapping("/list")
    public List<Registre> list(){
        return registreRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Registre> add(@RequestBody Registre registre){
        return new ResponseEntity<Registre>(registreRepository.save(registre), HttpStatus.CREATED);
    }
}
