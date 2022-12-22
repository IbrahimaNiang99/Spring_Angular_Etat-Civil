import { Component, OnInit } from '@angular/core';
import {MariageserviceService} from "../../../../services/mariageservice.service";

@Component({
  selector: 'app-liste-mariage',
  templateUrl: './liste-mariage.component.html',
  styleUrls: ['./liste-mariage.component.css']
})
export class ListeMariageComponent implements OnInit {

  listMariage:any;
  mariageRch:any;

  constructor(private mariageService:MariageserviceService) { }

  ngOnInit(): void {
    this.list();
  }

  list(){
    return this.mariageService.list().subscribe(res=>{
      this.listMariage = res
      console.log(this.listMariage)
    })
  }
}
