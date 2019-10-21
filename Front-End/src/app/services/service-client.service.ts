import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Client } from '../models/client';

@Injectable({
  providedIn: 'root'
})
export class ServiceClientService {

  constructor(private httpClient:HttpClient) { }

  getAll(){
    return this.httpClient.get(environment.serverUrl +"clients")
  }
  create(client : Client){
    return this.httpClient.post<Client>(environment.serverUrl + "clients" , client)
  }
  update(client : Client){
    return this.httpClient.put<Client>(environment.serverUrl + "clients/" + client.id, client)
  }
  delete(id : number){
    return this.httpClient.delete<Client>(environment.serverUrl + "clients/" + id)
  }
  getById(id : number){
    return this.httpClient.get<Client>(environment.serverUrl + "clients/" + id)
  }
  chercherClient(mc:string=""){
    return this.httpClient.get(environment.serverUrl +"chercherClients?mc="+ mc)
  }
}
