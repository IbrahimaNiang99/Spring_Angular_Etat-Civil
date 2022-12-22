import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Naissance} from "../dashboard/home/naissance/declaration-naissance/Naissance";

@Injectable({
  providedIn: 'root'
})
export class NaissanceserviceService {

  constructor(private http:HttpClient) { }


  public listeNaissance(){
    return this.http.get("http://localhost:9010/naissance/list");
  }

  public AjoutNaissance(naissance:Naissance){
    return this.http.post("http://localhost:9010/naissance/add", naissance);
  }

  public  getNumActe(){
    return  this.http.get("http://localhost:9010/naissance/getLastNumActe");
  }

  public  getById(id:number){
    return  this.http.get("http://localhost:9010/naissance/getById/"+id);
  }
}

