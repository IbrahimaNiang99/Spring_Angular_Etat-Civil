package com.example.jwt.Entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;

@Entity
public class Officier extends User{

    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Officier() {
        super();
    }

    public Officier(String signature, int id, String name, String userName, String CNI, String password,String email, Boolean etat, Long telephone, String fonction, HashSet<Role> roles){
        super(id, name, userName, password, email,CNI, etat, telephone, fonction, roles);
        this.signature = signature;
    }

}
