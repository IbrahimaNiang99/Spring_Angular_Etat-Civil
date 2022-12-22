package com.example.jwt.Controller;

import com.example.jwt.Entity.Centre;
import com.example.jwt.Repository.CentreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/centre")
@RestController
public class CentreController {

    @Autowired
    private final CentreRepository centreRepository;

    public CentreController(CentreRepository centreRepository) {
        this.centreRepository = centreRepository;
    }


     @GetMapping("/list")
    public List<Centre> list(){
        return centreRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Centre> addCentre(@RequestBody Centre centre){
            return new ResponseEntity<Centre>(centreRepository.save(centre), HttpStatus.CREATED) ;
    }

    @GetMapping("/getById/{id}")
    public Centre getById(@PathVariable Long id) throws Exception{
        Optional<Centre> centre = centreRepository.findById(id);
        if (centre.isPresent()){
            return centre.get();
        }else {
            throw new Exception("Ce temoin n'existe pas dans la BDD");
        }
    }

    @PutMapping("/update/{id}")
    public Centre updateCentre(@RequestBody Centre centre, @PathVariable Long id) {
        Centre existingCentre = centreRepository.findById(centre.getId()).orElse(null);

        existingCentre.setCodeCentre(centre.getCodeCentre());
        existingCentre.setCollectiviteLocale(centre.getCollectiviteLocale());
        existingCentre.setDepartement(centre.getDepartement());
        existingCentre.setLibelle(centre.getLibelle());
        existingCentre.setRegion(centre.getRegion());

        return centreRepository.save(centre);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        centreRepository.deleteById(id);
        return new ResponseEntity<String>("Supprimer", HttpStatus.OK);
    }



}
