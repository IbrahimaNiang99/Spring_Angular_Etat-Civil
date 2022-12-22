import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class RegistreserviceService {

  constructor(private http:HttpClient) { }

  public getRegistre(){
    return this.http.get("http://localhost:9010/registre/list")
  }
}
