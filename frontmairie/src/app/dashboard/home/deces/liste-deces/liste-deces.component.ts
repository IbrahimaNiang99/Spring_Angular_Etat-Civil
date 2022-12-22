import { Component, OnInit } from '@angular/core';
import {DecesserviceService} from "../../../../services/decesservice.service";

@Component({
  selector: 'app-liste-deces',
  templateUrl: './liste-deces.component.html',
  styleUrls: ['./liste-deces.component.css']
})
export class ListeDecesComponent implements OnInit {

  constructor(private decesService:DecesserviceService) { }
  deces:any;

  ngOnInit(): void {
    this.liste();
  }

  liste(){
    this.decesService.listeDeces().subscribe(res=>{
      this.deces = res
      console.log(res)
    })
  }

}
