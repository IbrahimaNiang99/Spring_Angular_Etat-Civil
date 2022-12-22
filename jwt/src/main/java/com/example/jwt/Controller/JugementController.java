package com.example.jwt.Controller;

import com.example.jwt.Entity.Jugement;
import com.example.jwt.Repository.JugementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/jugement")
@RestController
public class JugementController {

    @Autowired
    private final JugementRepository jugementRepository;

    public JugementController(JugementRepository jugementRepository) {
        this.jugementRepository = jugementRepository;
    }


    @GetMapping("/list")
    public List<Jugement> list(){
        return jugementRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Jugement> addJugement(@RequestBody Jugement jugement){
            return new ResponseEntity<Jugement>(jugementRepository.save(jugement), HttpStatus.CREATED) ;
    }

    @GetMapping("/getById/{id}")
    public Jugement getById(@PathVariable Long id) throws Exception{
        Optional<Jugement> jugement = jugementRepository.findById(id);
        if (jugement.isPresent()){
            return jugement.get();
        }else {
            throw new Exception("Ce temoin n'existe pas dans la BDD");
        }
    }

    @PutMapping("/update/{id}")
    public Jugement updateJugement(@RequestBody Jugement jugement, @PathVariable Long id) {
        Jugement existingJugement = jugementRepository.findById(jugement.getId()).orElse(null);

        existingJugement.setNumJugement(jugement.getNumJugement());
        existingJugement.setDateJugement(jugement.getDateJugement());
        existingJugement.setLieuJugement(jugement.getLieuJugement());
        return jugementRepository.save(existingJugement);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        jugementRepository.deleteById(id);
        return new ResponseEntity<String>("Supprimer", HttpStatus.OK);
    }


}
