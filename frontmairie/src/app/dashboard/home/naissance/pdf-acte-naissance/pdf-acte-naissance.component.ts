import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {NaissanceserviceService} from "../../../../services/naissanceservice.service";

@Component({
  selector: 'app-pdf-acte-naissance',
  templateUrl: './pdf-acte-naissance.component.html',
  styleUrls: ['./pdf-acte-naissance.component.css']
})
export class PdfActeNaissanceComponent implements OnInit {

  constructor(private route:ActivatedRoute, private naissService:NaissanceserviceService) { }
  nb:any;
  enfant:any;
  date = new Date();

  ngOnInit(): void {
    this.enfantDetails();
  }

  enfantDetails(){
    this.nb = this.route.snapshot.paramMap.get('id')
    return this.naissService.getById(this.nb).subscribe(res=>{
      this.enfant = res
      //console.log(this.enfant)
    })
  }

}
