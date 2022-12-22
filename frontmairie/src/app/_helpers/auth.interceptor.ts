import {TokenInterceptorService} from "../services/token-interceptor.service";
import {HttpHandler, HttpInterceptor, HttpRequest} from "@angular/common/http";
import {Injectable} from "@angular/core";

const TOKEN_HEADER_KEY = "Authorization";

@Injectable()
export class AuthInterceptor implements HttpInterceptor{
  constructor(private token:TokenInterceptorService) {}

  intercept(req: HttpRequest<any>, next: HttpHandler) {
    let authReq = req;
    const token = this.token;
    if (token!=null){
      authReq = req.clone({headers: req.headers.set(TOKEN_HEADER_KEY, 'Bearer '+token)})
    }
    return next.handle(authReq);
  }



}
