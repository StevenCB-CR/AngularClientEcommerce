import { Component, OnInit } from '@angular/core';
import { User ,userAddress} from '../../shared/user.model';
import {NgForm} from '@angular/forms';
import { UserService } from '../../shared/user.service';
import {ToastrModule, ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  user : User= new User();
  emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$";
  constructor(private userService: UserService, private toastr: ToastrService) { }

  ngOnInit() {
    this.resetForm();
  }

  resetForm(form? : NgForm){
    if(form != null)
    form.reset();
    this.user=new User();
  }
  OnSubmit(form: NgForm){
    //this.toastr.success('User registration successful or I think so! XD');
    this.userService.registerUser(form.value)
    .subscribe((data:any)=>{
      if(data!=null){
        this.resetForm(form);
        this.toastr.success('User registration successful');
      }else{
        this.toastr.error(data.Errors[0]);
      }
    });
  }

}
