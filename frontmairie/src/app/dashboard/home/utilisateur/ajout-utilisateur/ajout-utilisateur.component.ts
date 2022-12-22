import { Component, OnInit } from '@angular/core';
import {Utilisateur} from "./Utilisateur";

@Component({
  selector: 'app-ajout-utilisateur',
  templateUrl: './ajout-utilisateur.component.html',
  styleUrls: ['./ajout-utilisateur.component.css']
})
export class AjoutUtilisateurComponent implements OnInit {

  newUser:Utilisateur = new Utilisateur();

  constructor() { }

  ngOnInit(): void {
  }

  add(){
    console.log(this.newUser);
  }

}
