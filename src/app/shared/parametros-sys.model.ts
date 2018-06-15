import { TagContentType } from "@angular/compiler";

export class ParametrosSys{
nombre: String;
registroLegal: String;
tax:number;
direccion: number;

    constructor(nombre:String,registroLegal:String,tax:number,direccion:number){
        this.nombre=nombre;
        this.registroLegal=registroLegal;
        this.tax=tax;
        this.direccion=direccion;

    }
} 