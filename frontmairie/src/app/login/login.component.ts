import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {LoginserviceService} from "../services/loginservice.service";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {HttpClient} from "@angular/common/http";
import  {TokenInterceptorService} from "../services/token-interceptor.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formGroup: FormGroup | any;
  test: any;
  message:string="Identifiant incorrecte";
  constructor(private router:Router,
              private loginService:LoginserviceService,
              private http:HttpClient) {

  }

  ngOnInit(): void {

  }

   userConnect:any= {
    userName:'',
    password:''
  }


  onSubmit(){
    this.http.post(`http://localhost:9010/login?userName=${this.userConnect.userName}
    &password=${this.userConnect.password}`,
      this.userConnect).
      subscribe((res:any)=>{
      if (res.access_token)
      {
        localStorage.setItem('access_token', res.access_token)
        //console.log(res)
        this.router.navigateByUrl('/home')
      }
      else{
        return;
      }

    });
    }
    //return this.router.navigate(['/home']);

    /*
    return this.loginService.loginData(this.userConnect).subscribe((res:any) => {
      console.log('ee')
      if (res.status)
      {
        localStorage.setItem('access_token', res.access_token)
        console.log(res)
        this.router.navigateByUrl('/home')
      }
      else{
        console.log("retour a la page d'accueil")
      }
    });
        return this.router.navigate(['/home']);
     */
  //}
  /*
    onSubmit(){
      this.loginService.loginData(this.formGroup).subscribe(res=>{
        this.tokenStor.saveToken(res.accessToken)
        this.tokenStor.saveUser(res);
      }, error => {

      })
    }

  /*
   submit() {
      this.http.post('http://localhost:9010/login', this.userConnect)
        .subscribe((res: any) => {
          TokenInterceptorService.accessToken = res.token;

          this.router.navigate(['/home']);
        });
    }
   /*
    submitLogin(){
      return this.loginService
        .loginData(this.userConnect)
        .subscribe({

          next: (result: any)=>{
            if(result.success == true) {
              console.log("c'est bon");
              localStorage.setItem('access_token', result.data.token)
              console.log("c'est bon");
              this.router.navigate(['/home']);
            }

           // else
              // localStorage.setItem('access_token', data.data.token);
              //this.error= result.data
            // this.error.password = result.data.password

          },


         // error: (err : Error)=> console.log(err.message),


        });
    }

   //userConnect: any = {'userName': '', 'password': ''};
  /**/

/*
  initForm(){
    this.formGroup = new FormGroup({
      email:new FormControl('',[Validators.required]),
      password:new FormControl('',[Validators.required]),
    });

  }
/*
  login(){
    if (this.formGroup.valid){
      this.loginService.login(this.formGroup.value).subscribe(res=>{
        if (res.success){
          console.log(res);
        }else {
          console.log("Non");
        }
      })
    }
  }*/

}
