import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceConseillerService } from '../services/service-conseiller.service';

@Component({
  selector: 'app-updateconseiller',
  templateUrl: './updateconseiller.component.html',
  styleUrls: ['./updateconseiller.component.css']
})
export class UpdateconseillerComponent implements OnInit {

  conseillerForm: FormGroup;
  constructor(private fb: FormBuilder, private activeRoute: ActivatedRoute, private serviceConseiller:ServiceConseillerService, private router: Router) { }

  ngOnInit() {
    this.conseillerForm = this.fb.group({
      id: [''],
      nom: [''],
      prenom: [''],
      email: [''],
      adresse: [''],
      login: [''],
      password: [''],
      role:['']
     
    });
    this.activeRoute.params.subscribe( (p) => {
      this.serviceConseiller.getById(p.id).subscribe( (conseiller) => {
      console.log(conseiller)
        this.conseillerForm.setValue(conseiller)
      console.log(this.conseillerForm)
      })
    })
  }

  onSubmit(){
    this.serviceConseiller.update(this.conseillerForm.value).subscribe(() =>{
      this.router.navigate(['/listConseillers']);
    });
  }

}
