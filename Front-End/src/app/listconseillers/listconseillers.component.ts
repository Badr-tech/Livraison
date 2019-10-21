import { Component, OnInit } from '@angular/core';
import { Conseiller } from '../models/conseiller';
import { ServiceConseillerService } from '../services/service-conseiller.service';

@Component({
  selector: 'app-listconseillers',
  templateUrl: './listconseillers.component.html',
  styleUrls: ['./listconseillers.component.css']
})
export class ListconseillersComponent implements OnInit {

  listConseillers: Conseiller[];

  constructor(private serviceConseiller: ServiceConseillerService) { }

  ngOnInit() {
    this.findAll();
  }

  findAll(){
    this.serviceConseiller.getAll().subscribe((data: Conseiller[])=>{
      console.log(data)
      this.listConseillers=data;
    });
    
  }

  deleteClient(id : number){
    this.serviceConseiller.delete(id).subscribe(()=>{
      this.findAll()
    });
  }

}
