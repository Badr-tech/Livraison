import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Conseiller } from '../models/conseiller';

@Injectable({
  providedIn: 'root'
})
export class ServiceConseillerService {

  constructor(private httpClient: HttpClient) { }

  getAll(){
    return this.httpClient.get(environment.serverUrl +"conseillers")
  }

  create(conseiller : Conseiller){
    return this.httpClient.post<Conseiller>(environment.serverUrl + "conseillers" , conseiller)
  }
  update(conseiller : Conseiller){
    return this.httpClient.put<Conseiller>(environment.serverUrl + "conseillers/" + conseiller.id, conseiller)
  }
  delete(id : number){
    return this.httpClient.delete<Conseiller>(environment.serverUrl + "conseillers/" + id)
  }
  getById(id : number){
    return this.httpClient.get<Conseiller>(environment.serverUrl + "conseillers/" + id)
  }
}
