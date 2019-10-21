import { Component, OnInit } from '@angular/core';
import { ServiceClientService } from '../services/service-client.service';
import { Client } from '../models/client';

@Component({
  selector: 'app-listclients',
  templateUrl: './listclients.component.html',
  styleUrls: ['./listclients.component.css']
})
export class ListclientsComponent implements OnInit {

  listClients:Client[];
  constructor(private serviceClient:ServiceClientService) { }

  ngOnInit() {
    this.findAll()

  }

  findAll(){
    this.serviceClient.getAll().subscribe((data:any)=>{
      console.log(data)
      this.listClients = data;
      console.log(this.listClients)
    });
    
  }
  deleteClient(id : number){
    this.serviceClient.delete(id).subscribe(()=>{
      this.findAll()
    });
  }
  search(key){
    this.serviceClient.chercherClient(key).subscribe((data)=>{
      console.log(data)
      this.listClients=data["content"]
      console.log(this.listClients)
    })
  }

}
