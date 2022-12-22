import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {NaissanceserviceService} from "../../../../services/naissanceservice.service";

@Component({
  selector: 'app-pdf-extrait-naissance',
  templateUrl: './pdf-extrait-naissance.component.html',
  styleUrls: ['./pdf-extrait-naissance.component.css']
})
export class PdfExtraitNaissanceComponent implements OnInit {
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
