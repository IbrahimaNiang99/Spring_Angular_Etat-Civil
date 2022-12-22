package com.example.jwt.Controller;

import com.example.jwt.Entity.Formationsanitaire;
import com.example.jwt.Repository.FormationSanitaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequestMapping("/formationsanitaire")
@RestController
public class FormationSanitaireController {

    @Autowired
    private final FormationSanitaireRepository formationSanitaireRepository;

    public FormationSanitaireController(FormationSanitaireRepository formationSanitaireRepository) {
        this.formationSanitaireRepository = formationSanitaireRepository;
    }


    @GetMapping("/list")
    public List<Formationsanitaire> list(){
        return formationSanitaireRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Formationsanitaire> addFormationSanitaire(@RequestBody Formationsanitaire formationsanitaire){
            return new ResponseEntity<Formationsanitaire>(formationSanitaireRepository.save(formationsanitaire), HttpStatus.CREATED) ;
    }

    @GetMapping("/getById/{id}")
    public Formationsanitaire getById(@PathVariable Long id) throws Exception{
        Optional<Formationsanitaire> formationsanitaire = formationSanitaireRepository.findById(id);
        if (formationsanitaire.isPresent()){
            return formationsanitaire.get();
        }else {
            throw new Exception("Ce temoin n'existe pas dans la BDD");
        }
    }

    @PutMapping("/update/{id}")
    public Formationsanitaire updateFormationSanitaire(@RequestBody Formationsanitaire formationsanitaire, @PathVariable Long id) {
        Formationsanitaire existingFSanitaire = formationSanitaireRepository.findById(formationsanitaire.getId()).orElse(null);
        return formationSanitaireRepository.save(existingFSanitaire);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        formationSanitaireRepository.deleteById(id);
        return new ResponseEntity<String>("Supprimer", HttpStatus.OK);
    }



}
