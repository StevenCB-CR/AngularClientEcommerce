export class ProductModel {
    id: number
    //imagen: ImageBitmap
    productname: String
    precio: number
    stock: number
    ptoreorden: number
    categoria: String;

    constructor(productname: String,id:number, /*imagen: ImageBitmap,*/ precio: number, stock: number,ptoreorden: number, categoria: String){
        this.productname=productname;
        this.id=id;
       // this.imagen = imagen;
        this.precio = precio;
        this.stock = stock;
        this.ptoreorden = ptoreorden;
        this.categoria = categoria;
    }
}