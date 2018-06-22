import { Component, OnInit } from '@angular/core';
import { CategoryModel } from '../shared/category.model';
import { ProductModel } from '../shared/product.model';
import { MantenimientoService } from '../shared/mantenimiento.service';
import { ParametrosSys } from '../shared/parametros-sys.model';
<<<<<<< HEAD
import { NgIf } from '@angular/common';

=======
import { NgForm } from '@angular/forms';
>>>>>>> daf211ff915ee381ddbf3f1ddf2622c3f60886ab

@Component({
  selector: 'app-mantenimiento-adm',
  templateUrl: './mantenimiento-adm.component.html',
  styleUrls: ['./mantenimiento-adm.component.css']
})
export class MantenimientoAdmComponent implements OnInit {

  parametrosSys : ParametrosSys = new ParametrosSys();
  arregloCategoria : CategoryModel[] = new Array<CategoryModel>();
  arregloProducto : ProductModel[] = new Array<ProductModel>();
  

constructor(private mantenimientoService :MantenimientoService) {
    this.mantenimientoService.obtenerCategorias().subscribe((data:any)=>this.setCategoryArray(data));
    this.mantenimientoService.obtenerParametrosSys().subscribe((data:any)=>this.setParametrosSys(data));
    this.mantenimientoService.obtenerProductos().subscribe((data:any)=>this.setProductos(data));
    //this.arregloProducto.push(new ProductModel("Prueba",69,500,10,15,"Smart" ));
    //this.arregloProducto.push(new ProductModel("Prueba1",50,500,10,15,"Smart1" ));
    //this.arregloProducto.push(new ProductModel("Prueba2",65,500,10,15,"Smart2" ));
  }
  ngOnInit() { 
    
  }
  
  setCategoryArray(arreglo:CategoryModel[]){ 
   console.log(arreglo);
    this.arregloCategoria=arreglo;
  }
<<<<<<< HEAD
  /*mostrarCategoria(){
    var nvo= document.getElementById("agregarCategoria");
    NgIf nvo.click
    
  } */
  agregar(){
    
  } 

  addCategory(producto:ProductModel){
    this.arregloProducto.push(producto);
   }
=======
  setParametrosSys(parametros:ParametrosSys){ 
     this.parametrosSys=parametros;
   }
   setProductos(productos: ProductModel[]) {
    this.arregloProducto=productos;
  }

   OnSubmit(){
   //actualizacion parametros del sistema
   //TODO (arreglar comunicacón con API)
    console.log("estamos en la consola");
    console.log(this.parametrosSys);
    this.mantenimientoService.updateParametersSys(this.parametrosSys);
  }
>>>>>>> daf211ff915ee381ddbf3f1ddf2622c3f60886ab
  editCategory(id:any){ } 
  deleteCategory(id:any){ }

}
