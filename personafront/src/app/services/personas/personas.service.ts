import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PersonasService {

  private API_SERVER = "http://localhost:8080/personas"

  constructor(
    private httpClient: HttpClient
  ) {
  }



  public addPersona(persona: any): Observable<any> {
    return this.httpClient.post(this.API_SERVER + "/add", persona);
  }

  public updatePersona(persona: any): Observable<any> {
    return this.httpClient.post(this.API_SERVER + "/update", persona);
  }
  public deletePersona(cedula: Number): Observable<any> {
    return this.httpClient.get(this.API_SERVER + `/deleteById?cedula=${cedula}`);
  }

  public getAllPersonas(): Observable<any> {
    return this.httpClient.get(this.API_SERVER + "/listar_todos");
  }
}