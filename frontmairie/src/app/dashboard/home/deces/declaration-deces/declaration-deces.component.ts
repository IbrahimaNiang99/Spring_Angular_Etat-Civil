import { Component, OnInit } from '@angular/core';
import {DecesserviceService} from "../../../../services/decesservice.service";
import {RegistreserviceService} from "../../../../services/registreservice.service";
import {Deces} from "../Deces";
import {CentreService} from "../../../../services/centre.service";
import {FormationsanitaireService} from "../../../../services/formationsanitaire.service";
import {HttpHeaders} from "@angular/common/http";

@Component({
  selector: 'app-declaration-deces',
  templateUrl: './declaration-deces.component.html',
  styleUrls: ['./declaration-deces.component.css']
})
export class DeclarationDecesComponent implements OnInit {
  numActe: any;
  allRegistre:any;
  allCentre:any;
  allFormaSani:any;
  newDeces:Deces = new Deces();
  constructor(private decesService:DecesserviceService,
              private registreService:RegistreserviceService,
              private centreService:CentreService,
              private formSaniService:FormationsanitaireService) { }

  currentDate= new Date();
  ngOnInit(): void {
    this.getNumActe();
    this.listRegistre();
    this.listFormaSani();
    this.currentDate;
    this.listCentre();
  }

  //const // @ts-ignore

  add(){
    //console.log(this.newDeces)
    return this.decesService.AjoutDeces(this.newDeces).subscribe(res=>{});
  }
  getNumActe(){
    return this.decesService.getNumActe().subscribe(res=>{
      // @ts-ignore
      this.numActe = res + 1
      //console.log(res)
    });
  }


  listRegistre(){
      return this.registreService.getRegistre().subscribe(res=>{
        this.allRegistre = res
    });
    }

    listCentre(){
      this.centreService.listCentre().subscribe(res=>{
        this.allCentre = res
      });
    }

    listFormaSani(){
      this.formSaniService.list().subscribe(res=>{
        this.allFormaSani = res
      })
    }

}
