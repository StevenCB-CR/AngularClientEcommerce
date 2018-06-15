import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  token: string;
  constructor(private router: Router) {
    this.token=localStorage.getItem('userToken');
   }
  Logout() {
    localStorage.removeItem('userToken');
    this.router.navigate(['/login']);
  }
  Login() {
    this.router.navigate(['/login']);
  }
  ngOnInit() {
  }

}
