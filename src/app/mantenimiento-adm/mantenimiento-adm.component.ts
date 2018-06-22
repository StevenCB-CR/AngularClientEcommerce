import { Component, OnInit } from '@angular/core';
import { CategoryModel } from '../shared/category.model';
import { ProductModel } from '../shared/product.model';
import { MantenimientoService } from '../shared/mantenimiento.service';
import { ParametrosSys } from '../shared/parametros-sys.model';
import { NgIf } from '@angular/common';


@Component({
  selector: 'app-mantenimiento-adm',
  templateUrl: './mantenimiento-adm.component.html',
  styleUrls: ['./mantenimiento-adm.component.css']
})
export class MantenimientoAdmComponent implements OnInit {

  parametrosSys : ParametrosSys;
  arregloCategoria : CategoryModel[] = new Array<CategoryModel>();
  arregloProducto : ProductModel[] = new Array<ProductModel>();
  

constructor(private mantenimientoService :MantenimientoService) {
    this.mantenimientoService.obtenerCategorias().subscribe((data:any)=>this.setCategoryArray(data));
    this.arregloProducto.push(new ProductModel("Prueba",69,500,10,15,"Smart" ));
    this.arregloProducto.push(new ProductModel("Prueba1",50,500,10,15,"Smart1" ));
    this.arregloProducto.push(new ProductModel("Prueba2",65,500,10,15,"Smart2" ));
  }
  ngOnInit() { 
    
  }
  
  setCategoryArray(arreglo:CategoryModel[]){ 
   console.log(arreglo);
    this.arregloCategoria=arreglo;
  }
  /*mostrarCategoria(){
    var nvo= document.getElementById("agregarCategoria");
    NgIf nvo.click
    
  } */
  agregar(){
    
  } 

  addCategory(producto:ProductModel){
    this.arregloProducto.push(producto);
   }
  editCategory(id:any){ } 
  deleteCategory(id:any){ }

}
