import { Component } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {TokenInterceptorService} from "./services/token-interceptor.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontmairie';

  isLoggedIn = false;
  username : String | undefined;

  constructor(public tokenService:TokenInterceptorService) {}

  ngOnInit() {
    this.isLoggedIn = !!this.tokenService.getToken();

    if (this.isLoggedIn){
      const user = this.tokenService.getUser();
      console.log("connecter");
      console.log(user.getRole());
      console.log(user);
    }
  }

}
