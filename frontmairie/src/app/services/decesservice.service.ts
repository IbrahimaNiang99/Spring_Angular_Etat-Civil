import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Deces} from "../dashboard/home/deces/Deces";

@Injectable({
  providedIn: 'root'
})
export class DecesserviceService {

  constructor(private http:HttpClient) { }

  header:any = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  }

  public listeDeces(){
    return this.http.get("http://localhost:9010/deces/list");
  }

  public AjoutDeces(deces:Deces){
    return this.http.post("http://localhost:9010/deces/add", deces, this.header);
  }

  public getNumActe(){
    return this.http.get("http://localhost:9010/deces/getLastNumActe")
  }



}
