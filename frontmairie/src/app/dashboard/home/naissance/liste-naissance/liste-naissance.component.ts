import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {NaissanceserviceService} from "../../../../services/naissanceservice.service";
import {Router} from "@angular/router";
import {Naissance} from "../declaration-naissance/Naissance";

@Component({
  selector: 'app-liste-naissance',
  templateUrl: './liste-naissance.component.html',
  styleUrls: ['./liste-naissance.component.css']
})
export class ListeNaissanceComponent implements OnInit {

  listeNaiss:any;
  naissanceRch:any;
  naissFound:any;

  constructor(private naissanceService:NaissanceserviceService,
              private router:Router) { }

  ngOnInit(): void {
    this.list();
  }

  list(){
    return this.naissanceService.listeNaissance().subscribe(res=>{
      this.listeNaiss = res;
      console.log(res);
    });
  }

  details(id:number){
    return this.router.navigate(['/home/naissance/details/',id]);

    /*
    return this.naissanceService.getById(id).subscribe(res=>{
      this.naissFound = res
      console.log(res);
    });
     */
  }

}
