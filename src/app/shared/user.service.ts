import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Response, Http} from '@angular/http';
import {Observable} from 'rxjs';
import 'rxjs/add/operator/map';
import { User } from './user.model';
import { Message } from '@angular/compiler/src/i18n/i18n_ast';

@Injectable()
export class UserService {
  readonly rootUrl = 'http://localhost:8080/api/user';
  constructor(private http: Http,private httpC:HttpClient) { }
  registerUser(user:User){
   
    return this.http.post(this.rootUrl+'/',user);
  }
   userAuthentication(nameUser,pass) :Observable<any>{
     
     var dat= nameUser+"/"+pass; 
     return this.http.get(this.rootUrl+'/'+dat).map(response =>response.json());
   }
  
}
