export class User {
    nameUser:String;
    email: String;
    pass: String;


   
    constructor(nameUser?:String,email?:String,pass?:String){
        this.nameUser=nameUser;
        this.email=email;
        this.pass= pass;

    }
}

export class userAddress{

    country :String 
    province :String 
    canton :String 
    district :String 
    addressDetails :String 

    constructor(country?:String,province?:String,canton?:String,district?:String,addressDetails?:String){
        this.country=country;
        this.province=province;
        this.canton=canton;
        this.district=district;
        this.addressDetails=addressDetails;
    }

   
}
