import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ServiceClientService } from '../services/service-client.service';

@Component({
  selector: 'app-updateclient',
  templateUrl: './updateclient.component.html',
  styleUrls: ['./updateclient.component.css']
})
export class UpdateclientComponent implements OnInit {
  userForm: FormGroup;
  constructor(private fb: FormBuilder, private activeRoute: ActivatedRoute, private serviceClient:ServiceClientService, private router: Router) { }

  ngOnInit() {
    this.userForm = this.fb.group({
      id: [''],
      nom: [''],
      prenom: [''],
      email: [''],
      adresse: [''],
      listeCompte:{
        numeroCompte:[''],
        solde:[''],
        decouvert:['']
      }
    });
    this.activeRoute.params.subscribe( (p) => {
      this.serviceClient.getById(p.id).subscribe( client => {
      this.userForm.setValue(client)
      console.log(this.userForm)
      })
    })
  }
  onSubmit(){
    this.serviceClient.update(this.userForm.value).subscribe(() =>{
      this.router.navigate(['/listClients']);
    });
  }

}
