import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {NotFoundComponent} from "./not-found/not-found.component";

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: '', pathMatch: 'full' , redirectTo: '/login'},
  {path: '**', pathMatch: 'full' , component: NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
