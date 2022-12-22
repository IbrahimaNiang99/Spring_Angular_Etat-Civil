package com.example.jwt.Controller;

import com.example.jwt.Entity.Temoin;
import com.example.jwt.Repository.TemoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/temoin")
@RestController
public class TemoinController{
    @Autowired
    private final TemoinRepository temoinRepository;

    public TemoinController(TemoinRepository temoinRepository) {
        this.temoinRepository = temoinRepository;
    }

    @GetMapping("/list")
    public List<Temoin> list(){
        return temoinRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Temoin> addTemoin(@RequestBody Temoin temoin){
            return new ResponseEntity<Temoin>(temoinRepository.save(temoin), HttpStatus.CREATED) ;
    }

    @GetMapping("/getById/{id}")
    public Temoin getById(@PathVariable Long id) throws Exception{
        Optional<Temoin> temoin = temoinRepository.findById(id);
        if (temoin.isPresent()){
            return temoin.get();
        }else {
            throw new Exception("Ce temoin n'existe pas dans la BDD");
        }
    }

    @PutMapping("/update/{id}")
    public Temoin updateTemoin(@RequestBody Temoin temoin, @PathVariable Long id) {
        Temoin existingTemoin = temoinRepository.findById(temoin.getId()).orElse(null);

        existingTemoin.setCNI(temoin.getCNI());
        existingTemoin.setDomicile(temoin.getDomicile());
        existingTemoin.setPrenom(temoin.getPrenom());
        existingTemoin.setNom(temoin.getNom());
        existingTemoin.setProfession(temoin.getProfession());

        return temoinRepository.save(existingTemoin);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        temoinRepository.deleteById(id);
        return new ResponseEntity<String>("Supprimer", HttpStatus.OK);
    }

}
