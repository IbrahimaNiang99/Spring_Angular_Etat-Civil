package com.example.jwt.Controller;

import com.example.jwt.Entity.Officier;
import com.example.jwt.Entity.User;
import com.example.jwt.Repository.OfficierRepository;
import com.example.jwt.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/officier")
@RestController
public class OfficierController {

    @Autowired
    private final OfficierRepository officierRepository;

    private final UserRepository userRepository;

    public OfficierController(OfficierRepository officierRepository, UserRepository userRepository) {
        this.officierRepository = officierRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/list")
    public List<Officier> list(){
        return officierRepository.findAll();
    }
/*
    @PutMapping("/update/{id}")
    public Officier updateOfficier(@RequestBody Officier officier, @PathVariable Long id) {
        Officier existingOfficier = officierRepository.findById((long) officier.getId()).orElse(null);

        existingOfficier.setEmail(officier.getEmail());
        existingOfficier.setUserName(officier.getUserName());
        existingOfficier.setEtat(officier.getEtat());
        existingOfficier.setFonction(officier.getFonction());
        existingOfficier.setName(officier.getName());
        existingOfficier.setCNI(officier.getCNI());
        existingOfficier.setPassword(officier.getPassword());

    }

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/adduser").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }*/

    @PostMapping("/add")
    public ResponseEntity<Officier> addOfficier(@RequestBody Officier officier){
        return new ResponseEntity<Officier>(userRepository.save(officier), HttpStatus.CREATED) ;
    }

    @GetMapping("/getById/{id}")
    public Officier getById(@PathVariable Long id) throws Exception{
        Optional<Officier> officier = officierRepository.findById(id);
        if (officier.isPresent()){
            return officier.get();
        }else {
            throw new Exception("Cet officier n'existe pas dans la BDD");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        officierRepository.deleteById(id);
        return new ResponseEntity<String>("Supprimer", HttpStatus.OK);
    }

}
