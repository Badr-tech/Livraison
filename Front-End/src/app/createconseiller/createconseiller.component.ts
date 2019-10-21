import { Component, OnInit } from '@angular/core';
import { Conseiller } from '../models/conseiller';
import { ServiceConseillerService } from '../services/service-conseiller.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-createconseiller',
  templateUrl: './createconseiller.component.html',
  styleUrls: ['./createconseiller.component.css']
})
export class CreateconseillerComponent implements OnInit {

  newConseiller:Conseiller;
  constructor(private serviceConseiller:ServiceConseillerService, private router:Router) { }

  ngOnInit() {
  }

  onSubmit(userForm: NgForm) {
    this.newConseiller = userForm.value
    console.log(this.newConseiller)
    this.serviceConseiller.create(this.newConseiller).subscribe((data: Conseiller) =>{ 
      this.router.navigate(['/listConseillers'])
    })}

}
