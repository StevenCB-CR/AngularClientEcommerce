export class ProductModel {
    id: number
    //imagen: ImageBitmap
    productName: String
    price: number
    unitsOnStock: number
    reorderPoint: number
    categoria: String =  "laptops(-Quemado-)";

    constructor(productname: String,id:number, /*imagen: ImageBitmap,*/ precio: number, stock: number,ptoreorden: number, categoria: String){
        this.productName=productname;
        this.id=id;
       // this.imagen = imagen;
        this.price = precio;
        this.unitsOnStock = stock;
        this.reorderPoint = ptoreorden;
        this.categoria = "laptops(-Quemado-)";
    }
}
