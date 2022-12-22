import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Naissance} from "../dashboard/home/naissance/declaration-naissance/Naissance";
import {Mariage} from "../dashboard/home/mariage/Mariage";

@Injectable({
  providedIn: 'root'
})
export class MariageserviceService {

  constructor(private http:HttpClient) { }

  public list(){
    return this.http.get("http://localhost:9010/mariage/list");
  }

  public getNumActe(){
    return this.http.get("http://localhost:9010/mariage/getLastNumActe")
  }

  public AjoutNaissance(mariage:Mariage){
    return this.http.post("http://localhost:9010/mariage/add", mariage);
  }

}
