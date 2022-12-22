package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;


@Entity
public class Administrateur extends User{

    public Administrateur(){
        super();
    }

    public Administrateur(int id, String name, String userName, String CNI, String password,String email, Boolean etat, Long telephone, String fonction, HashSet<Role> roles){
        super(id, name, userName, CNI, password, email, etat, telephone, fonction, roles);
    }


}
