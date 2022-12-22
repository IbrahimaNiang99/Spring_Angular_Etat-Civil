import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import { Config} from "../config/config";
import {map, Observable} from "rxjs";


const URL = "http://localhost:9010/login";

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})

export class LoginserviceService {
  constructor(private http:HttpClient) { }

  headers = new HttpHeaders({
    'Content-Type': 'application/json',
    'Authorization': 'Bearer ' +localStorage.getItem("access_token") });

  loginData(infoUser:any){
    return this.http.post("http://localhost:9010/login", infoUser);
  }



}
