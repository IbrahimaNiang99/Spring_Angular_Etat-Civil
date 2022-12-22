import { Component, OnInit } from '@angular/core';
import {UserserviceService} from "../../../../services/userservice.service";

@Component({
  selector: 'app-liste-utilisateur',
  templateUrl: './liste-utilisateur.component.html',
  styleUrls: ['./liste-utilisateur.component.css']
})
export class ListeUtilisateurComponent implements OnInit {

  allUser:any;
  userRch:any;

  constructor(private userService:UserserviceService) { }


  ngOnInit(): void {
    this.list();
    this.userRch;
  }

  list(){
    return this.userService.list().subscribe(res=>{
      this.allUser = res
      console.log(res)
    })
  }


}
