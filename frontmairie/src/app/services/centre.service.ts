import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Centre} from "../dashboard/home/Centre";

@Injectable({
  providedIn: 'root'
})
export class CentreService {

  constructor(private http:HttpClient) { }

  public listCentre(){
    return this.http.get("http://localhost:9010/centre/list");
  }

  public addCentre(centre:Centre){
    return this.http.post("http://localhost:9010/centre/add", centre);
  }
}
