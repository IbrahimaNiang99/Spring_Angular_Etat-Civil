import { Component, OnInit } from '@angular/core';
import {NaissanceserviceService} from "../../../../services/naissanceservice.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-impression-naissance',
  templateUrl: './impression-naissance.component.html',
  styleUrls: ['./impression-naissance.component.css']
})
export class ImpressionNaissanceComponent implements OnInit {

  listeNaiss:any;
  naissanceRch:any;

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

  pdfActe(id:number) {
    return this.router.navigate(['/home/naissance/pdfActe/', id]);
  }
  pdfExtrait(id:number) {
    return this.router.navigate(['/home/naissance/pdfExtrait/', id]);
  }
  pdfBulletin(id:number) {
    return this.router.navigate(['/home/naissance/pdfBulletin/', id]);
  }


  }
