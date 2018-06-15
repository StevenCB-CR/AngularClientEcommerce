export class CategoryModel {
    id: number
    categoryName: String;

    constructor(categoryname: String,id:number){
        this.categoryName=categoryname;
        this.id=id;
    }
}