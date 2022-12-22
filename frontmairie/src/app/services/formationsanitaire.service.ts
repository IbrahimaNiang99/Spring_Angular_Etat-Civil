import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {FormationSanitaire} from "../dashboard/home/formation-sanitaire/FormationSanitaire";

@Injectable({
  providedIn: 'root'
})
export class FormationsanitaireService {

  constructor(private http:HttpClient) { }

  public list(){
    return this.http.get("http://localhost:9010/formationsanitaire/list");
  }

  public add(formaSanitaire:FormationSanitaire){
    return this.http.post("http://localhost:9010/formationsanitaire/add", formaSanitaire);
  }
}
