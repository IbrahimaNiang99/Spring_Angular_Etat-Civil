package com.example.jwt.Controller;

import com.example.jwt.Entity.Deces;
import com.example.jwt.Entity.Temoin;
import com.example.jwt.Repository.DecesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/deces")
public class DecesController {

    private final DecesRepository decesRepository;

    public DecesController(DecesRepository decesRepository) {
        this.decesRepository = decesRepository;
    }

    @GetMapping("/list")
    public List<Deces> list(){
        return decesRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Deces> addDeces(@RequestBody Deces deces){
        return new ResponseEntity<Deces>(decesRepository.save(deces), HttpStatus.CREATED) ;
    }

    @GetMapping("/getLastNumActe")
    public Long getNumActe(){
        return decesRepository.getLastNumActe();
    }

}
