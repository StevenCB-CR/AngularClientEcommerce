import { Injectable } from '@angular/core';
import { Http, RequestOptions, Headers } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { ParametrosSys } from './parametros-sys.model';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class MantenimientoService {
  
  readonly rootUrl = 'http://localhost:8080/api';
  constructor(private http: Http,private httpC: HttpClient) {
    
   }

  public obtenerCategorias():Observable<any>{
    return this.http.get(this.rootUrl+"/ProductCategory/").map(response =>response.json());
  }

  public obtenerParametrosSys(): Observable<any> {
    return this.http.get(this.rootUrl+"/ParametrosSys/").map(response =>response.json());
  }

  public updateParametersSys(parametersSys: ParametrosSys) {
    console.log("Enviando solicitud actualizar parametrosSys");
   this.httpC.post(this.rootUrl+'/ParametrosSys/',parametersSys).map((response: Response) => {
     console.log("RESPUESTA API");
    console.log(response.json());    
    
});

  }

}
