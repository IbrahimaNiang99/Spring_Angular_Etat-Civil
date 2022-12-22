import { Injectable } from '@angular/core';
import {
  HttpClient,
  HttpErrorResponse,
  HttpEvent,
  HttpHandler,
  HttpInterceptor,
  HttpRequest
} from "@angular/common/http";
import {catchError, Observable, switchMap, throwError} from 'rxjs';

const TOKEN_KEY = "auth-token";
const USER_KEY = "auth-user";

@Injectable({
  providedIn: 'root'
})
export class TokenInterceptorService{
  constructor() {}

  singOut(){
    window.sessionStorage.clear();
  }

  public getToken():string{
    // @ts-ignore
    return sessionStorage.getItem(TOKEN_KEY);
  }

  public saveToken(token: string){
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.setItem(TOKEN_KEY, token)
  }

  public getUser(){
    // @ts-ignore
    return JSON.parse(sessionStorage.getItem(USER_KEY));
  }

  public saveUser(user: any){
    window.sessionStorage.removeItem(USER_KEY);
    window.sessionStorage.setItem(USER_KEY,JSON.stringify(user));
  }
}
