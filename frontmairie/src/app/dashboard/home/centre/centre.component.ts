import { Component, OnInit } from '@angular/core';
import {CentreService} from "../../../services/centre.service";
import {Centre} from "../Centre";

@Component({
  selector: 'app-centre',
  templateUrl: './centre.component.html',
  styleUrls: ['./centre.component.css']
})
export class CentreComponent implements OnInit {
  newCentre = new Centre();
  centre:any;
  centreSh:any;
  constructor(private centreService:CentreService) { }


  ngOnInit(): void {
    this.list();
  }

  add(){
    this.centreService.addCentre(this.newCentre).subscribe(res=>{
      //console.log(this.newCentre);
    })
    location.reload();
  }

  list(){
    return this.centreService.listCentre().subscribe(res=>{
      this.centre = res
    })
  }

}
