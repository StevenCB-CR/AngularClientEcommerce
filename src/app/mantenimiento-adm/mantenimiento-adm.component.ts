import { Component, OnInit } from '@angular/core';
import { CategoryModel } from '../shared/category.model';
import { ProductModel } from '../shared/product.model';
import { MantenimientoService } from '../shared/mantenimiento.service';
import { ParametrosSys } from '../shared/parametros-sys.model';

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
    this.arregloProducto.push(new ProductModel("Prueba",69,500,10,15,"Smart" ));
    this.arregloProducto.push(new ProductModel("Prueba1",50,500,10,15,"Smart1" ));
    this.arregloProducto.push(new ProductModel("Prueba2",65,500,10,15,"Smart2" ));
    this.parametrosSys.nombre="nombreQuemado";
    this.parametrosSys.direccion="direccionQuemado";
    this.parametrosSys.registroLegal="legalQuemado";
    this.parametrosSys.tax= 6969;
  }
  ngOnInit() { 
    
  }
  
  setCategoryArray(arreglo:CategoryModel[]){ 
   console.log(arreglo);
    this.arregloCategoria=arreglo;
  }
  editCategory(id:any){ } 
  deleteCategory(id:any){ }

}
