import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class MantenimientoService {
  readonly rootUrl = 'http://localhost:8080/api';
  constructor(private http: Http) { }

  public obtenerCategorias():Observable<any>{
    return this.http.get(this.rootUrl+"/ProductCategory/").map(response =>response.json());
  }

}
