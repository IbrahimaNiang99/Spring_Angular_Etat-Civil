package com.example.jwt.Controller;

import com.example.jwt.Dto.NaissanceRequest;
import com.example.jwt.Dto.UserRoleRequest;
import com.example.jwt.Entity.Naissance;
import com.example.jwt.Entity.Registre;
import com.example.jwt.Repository.*;
import com.example.jwt.Service.NaissanceService.NaissService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/naissance")
@RestController
public class NaissanceController {

    private NaissService naissService;

    private ActeRepository acteRepository;
    private RegistreRepository registreRepository;
    private FormationSanitaireRepository formationSanitaireRepository;
    private PersonneRepository repository;
    private DeclarantRepository declarantRepository;
    private PersonneRepository personneRepository;
    private final NaissanceRepository naissanceRepository;

    public NaissanceController(NaissanceRepository naissanceRepository) {
        this.naissanceRepository = naissanceRepository;
    }

    @GetMapping("/list")
    public List<Naissance> list(){
        return naissanceRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody NaissanceRequest naissanceRequest){
       /* naissService.addNaissance(
                naissanceRequest.getId(),
                naissanceRequest.getNumActe(),
                naissanceRequest.getDateDeclaration(),
                naissanceRequest.getTypeDeclaration(),
                naissanceRequest.getRegistre(),
                naissanceRequest.getFormationsanitaire(),

                naissanceRequest.getDeclarant(),
                naissanceRequest.getDeclare(),
                naissanceRequest.getJugement(),
                naissanceRequest.getMereEnfant(),
                naissanceRequest.getPereEnfant(),
                naissanceRequest.getCentre()

                );*/
        return ResponseEntity.ok().build();
    }
    /*
    public ResponseEntity<Naissance> addDeces(@RequestBody Naissance naissance, Registre registre){
        System.out.println(naissance);
        return new ResponseEntity<Naissance>(naissanceRepository.save(naissance), HttpStatus.CREATED) ;
    }*/

    @GetMapping("/getLastNumActe")
    public Long getNumActe(){
        return naissanceRepository.getLastNumActe();
    }

    @GetMapping("/nbNaiss")
    public Long getNbNaiss(){
        return naissanceRepository.count();
    }

    @GetMapping("/getById/{id}")
    public Naissance getById(@PathVariable Long id) throws Exception{
        Optional<Naissance> naiss = naissanceRepository.findById(id);
        if (naiss.isPresent()){
            return naiss.get();
        }else {
            throw new Exception("Cette declaration n'existe pas dans la BDD");
        }
    }

}