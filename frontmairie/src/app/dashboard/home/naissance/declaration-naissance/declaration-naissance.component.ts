import { Component, OnInit } from '@angular/core';
import {NaissanceserviceService} from "../../../../services/naissanceservice.service";
import {RegistreserviceService} from "../../../../services/registreservice.service";
import {CentreService} from "../../../../services/centre.service";
import {FormationsanitaireService} from "../../../../services/formationsanitaire.service";
import {Deces} from "../../deces/Deces";
import {Naissance} from "./Naissance";
import {fchmod} from "fs";

@Component({
  selector: 'app-declaration-naissance',
  templateUrl: './declaration-naissance.component.html',
  styleUrls: ['./declaration-naissance.component.css']
})
export class DeclarationNaissanceComponent implements OnInit {

  numActe: any;
  allRegistre:any;
  allCentre:any;
  allFormaSani:any;
  newNaissance = new Naissance();
  currentDate= new Date();
  etat:string = "hide";
  typeDec= false;
  test=false;

  constructor(private naissanceService:NaissanceserviceService,
              private registreService:RegistreserviceService,
              private centreService:CentreService,
              private formSaniService:FormationsanitaireService) { }


  ngOnInit(): void {
    this.listRegistre();
    this.listFormaSani();
    this.currentDate;
    this.listCentre();
    this.getNumActe();
    this.etat;
    this.typeDec;
  }

  add(){
    this.newNaissance.numActe = this.numActe;
    console.log(this.newNaissance);
    return this.naissanceService.AjoutNaissance(this.newNaissance).subscribe(res=>{});
  }

  getNumActe(){
    this.naissanceService.getNumActe().subscribe(res=>{
      // @ts-ignore
      this.numActe = res + 1
    });
    if (this.numActe == null){
      return 1;
    }else {
      return this.numActe;
    }
    return this.numActe;
    console.log(this);
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

  jmtFunction(){
    this.typeDec = true;
  }
  tarFunction(){
    this.typeDec = false;
  }
  nrmFunction(){
    this.typeDec = false;
  }
}
