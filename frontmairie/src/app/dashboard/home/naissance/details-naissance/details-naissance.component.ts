import { Component, OnInit } from '@angular/core';
import {ListeNaissanceComponent} from "../liste-naissance/liste-naissance.component";
import {ActivatedRoute} from "@angular/router";
import {NaissanceserviceService} from "../../../../services/naissanceservice.service";

@Component({
  selector: 'app-details-naissance',
  templateUrl: './details-naissance.component.html',
  styleUrls: ['./details-naissance.component.css']
})
export class DetailsNaissanceComponent implements OnInit {

  constructor(private route:ActivatedRoute, private naissService:NaissanceserviceService) { }
  nb:any;
  enfant:any;

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
