package com.example.jwt.Controller;

import com.example.jwt.Entity.Mariage;
import com.example.jwt.Entity.Naissance;
import com.example.jwt.Repository.MariageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mariage")
public class MariageController {

    private final MariageRepository mariageRepository;

    public MariageController(MariageRepository mariageRepository) {
        this.mariageRepository = mariageRepository;
    }


    @GetMapping("/list")
    public List<Mariage> list(){
        return mariageRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Mariage> addMariage(@RequestBody Mariage mariage){
        return new ResponseEntity<Mariage>(mariageRepository.save(mariage), HttpStatus.CREATED) ;
    }

    @GetMapping("/getLastNumActe")
    public Long getNumActe(){
        return mariageRepository.getLastNumActe();
    }

}
