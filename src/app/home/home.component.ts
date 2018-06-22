import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
<<<<<<< HEAD
import * as jsPDF from 'jspdf';
=======
import { ProductModel } from '../shared/product.model';
import { MantenimientoService } from '../shared/mantenimiento.service';
>>>>>>> daf211ff915ee381ddbf3f1ddf2622c3f60886ab

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  arregloProducto : ProductModel[] = new Array<ProductModel>();
  constructor(private mantenimientoService :MantenimientoService) { 
    this.mantenimientoService.obtenerProductos().subscribe((data:any)=>this.setProductos(data));
  }

  ngOnInit() {
  }

<<<<<<< HEAD
  downloadPDF(){
    const doc = new jsPDF();
    doc.text('Some text here', 10, 10);

    doc.save('Test.pdf');
  }


=======
  setProductos(productos: ProductModel[]) {
    this.arregloProducto=productos;
  }
>>>>>>> daf211ff915ee381ddbf3f1ddf2622c3f60886ab
}
