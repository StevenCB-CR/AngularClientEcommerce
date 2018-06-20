import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductModel } from '../shared/product.model';
import { MantenimientoService } from '../shared/mantenimiento.service';

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

  setProductos(productos: ProductModel[]) {
    this.arregloProducto=productos;
  }
}
