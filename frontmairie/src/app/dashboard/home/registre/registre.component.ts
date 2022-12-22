import { Component, OnInit } from '@angular/core';
import {RegistreserviceService} from "../../../services/registreservice.service";

@Component({
  selector: 'app-registre',
  templateUrl: './registre.component.html',
  styleUrls: ['./registre.component.css']
})
export class RegistreComponent implements OnInit {
  registre:any;
  constructor(private resistreService:RegistreserviceService) { }

  ngOnInit(): void {
    this.list();
  }

  list(){
    return this.resistreService.getRegistre().subscribe(res=>{
      this.registre = res;
      console.log(res)
    });
  }

}
