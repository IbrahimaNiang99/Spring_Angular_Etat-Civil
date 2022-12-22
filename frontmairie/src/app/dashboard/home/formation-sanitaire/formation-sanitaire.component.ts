import { Component, OnInit } from '@angular/core';
import {FormationsanitaireService} from "../../../services/formationsanitaire.service";
import {FormationSanitaire} from "./FormationSanitaire";

@Component({
  selector: 'app-formation-sanitaire',
  templateUrl: './formation-sanitaire.component.html',
  styleUrls: ['./formation-sanitaire.component.css']
})
export class FormationSanitaireComponent implements OnInit {
  allFormaSani:any;
  newFs = new FormationSanitaire();
  FormationSanitaire:any;

  constructor(private formsanitaireService:FormationsanitaireService) { }

  ngOnInit(): void {
    this.list();
  }

  list(){
    this.formsanitaireService.list().subscribe(res=>{
      this.allFormaSani = res
    })
  }

  add(){
    //console.log(this.newFs);
    this.formsanitaireService.add(this.newFs).subscribe(res=>{
    });
    location.reload();
  }

}
