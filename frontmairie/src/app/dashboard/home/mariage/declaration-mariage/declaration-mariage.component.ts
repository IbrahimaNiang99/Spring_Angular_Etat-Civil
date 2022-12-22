import { Component, OnInit } from '@angular/core';
import {FormBuilder, Validators} from '@angular/forms';
import {Mariage} from "../Mariage";
import {MariageserviceService} from "../../../../services/mariageservice.service";
import {RegistreserviceService} from "../../../../services/registreservice.service";
@Component({
  selector: 'app-declaration-mariage',
  templateUrl: './declaration-mariage.component.html',
  styleUrls: ['./declaration-mariage.component.css']
})
export class DeclarationMariageComponent implements OnInit {

  firstFormGroup = this._formBuilder.group({
    firstCtrl: ['', Validators.required],
  });
  secondFormGroup = this._formBuilder.group({
    secondCtrl: ['', Validators.required],
  });
  isEditable = false;
  constructor(private _formBuilder: FormBuilder, private mariageService:MariageserviceService, private registreService:RegistreserviceService) { }

  numActe: any;
  allRegistre: any;
  mariageRch:any;
  newMariage:Mariage = new Mariage();

  ngOnInit(): void {
    this.getNumActe();
    this.listRegistre();
  }

  add(){
    console.log(this.newMariage);
    //return this.mariageService.AjoutNaissance(this.newMariage).subscribe({});
  }

  getNumActe(){
    this.mariageService.getNumActe().subscribe(res=>{
      // @ts-ignore
      this.numActe = res + 1
    });
    if (this.numActe == null){
      return 1;
    }else {
      return this.numActe;
    }
    return this.numActe;
  }

  listRegistre(){
    return this.registreService.getRegistre().subscribe(res=>{
      this.allRegistre = res
    });
  }

}
