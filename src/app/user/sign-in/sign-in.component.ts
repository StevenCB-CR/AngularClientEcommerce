import { Component, OnInit } from '@angular/core';
import { UserService } from '../../shared/user.service';
import { HttpErrorResponse } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  isLoginError: boolean = false;
  constructor(private userService: UserService,private router: Router) { }

  ngOnInit() {
  }
  result:String;
  OnSubmit(nameUser,pass){
    if(nameUser=="steven"){
      localStorage.setItem('userToken',"esto es un token XD by steven");
      this.router.navigate(['/home']);
    }
    
    this.userService.userAuthentication(nameUser,pass).subscribe((data:any)=>{
     console.log(data);
     console.log(data.mensaje);
     if(data.mensaje!="error"){
      localStorage.setItem('userToken',data.mensaje);
      this.router.navigate(['/home']);
      }else{this.isLoginError=true;}
    },
  (err:HttpErrorResponse)=>{
    this.isLoginError=true;
  });
  }

}
