import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as jsPDF from 'jspdf';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  constructor(private router: Router) { 
    
  }

  ngOnInit() {
  }

  downloadPDF(){
    const doc = new jsPDF();
    doc.text('Some text here', 10, 10);

    doc.save('Test.pdf');
  }


}
