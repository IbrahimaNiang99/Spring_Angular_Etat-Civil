import { HttpHeaders } from "@angular/common/http";

export class Config{
  static HEADER : any = {headers : new HttpHeaders({
      'Authorization': 'Bearer ' + localStorage.getItem("access_token") })};
}
