import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent implements OnInit {

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit() {
  }
  authentifier(data: NgForm) {
    let user = data.value
    console.log(user)
    this.authService.login(user).subscribe(data => {
      console.log(data)
      /* if (true) {
        this.router.navigate(['/'])
      }
      else{
        
      }*/
    }) 
  }
}
