import { Component, OnInit } from '@angular/core';
import { CategoryModel } from '../shared/category.model';
import { MantenimientoService } from '../shared/mantenimiento.service';
import { ParametrosSys } from '../shared/parametros-sys.model';

@Component({
  selector: 'app-mantenimiento-adm',
  templateUrl: './mantenimiento-adm.component.html',
  styleUrls: ['./mantenimiento-adm.component.css']
})
export class MantenimientoAdmComponent implements OnInit {

  parametrosSys : ParametrosSys;
  arregloCategoria : CategoryModel[] = new Array<CategoryModel>();
  

constructor(private mantenimientoService :MantenimientoService) {
    this.mantenimientoService.obtenerCategorias().subscribe((data:any)=>this.setCategoryArray(data));
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
