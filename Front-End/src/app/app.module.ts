import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { ListclientsComponent } from './listclients/listclients.component';
import { HttpClientModule } from '@angular/common/http';
import { CreateclientComponent } from './createclient/createclient.component';
import { UpdateclientComponent } from './updateclient/updateclient.component';
import { ListconseillersComponent } from './listconseillers/listconseillers.component';
import { CreateconseillerComponent } from './createconseiller/createconseiller.component';
import { UpdateconseillerComponent } from './updateconseiller/updateconseiller.component';
import { ListcomptesComponent } from './listcomptes/listcomptes.component';
import { VirementComponent } from './virement/virement.component';
import { ParametrageComponent } from './parametrage/parametrage.component';
import { RapporttransactionComponent } from './rapporttransaction/rapporttransaction.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AuthentificationComponent,
    ListclientsComponent,
    CreateclientComponent,
    UpdateclientComponent,
    ListconseillersComponent,
    CreateconseillerComponent,
    UpdateconseillerComponent,
    ListcomptesComponent,
    VirementComponent,
    ParametrageComponent,
    RapporttransactionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
