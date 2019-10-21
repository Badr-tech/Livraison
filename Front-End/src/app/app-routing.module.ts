import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListclientsComponent } from './listclients/listclients.component';
import { CreateclientComponent } from './createclient/createclient.component';
import { UpdateclientComponent } from './updateclient/updateclient.component';
import { ListconseillersComponent } from './listconseillers/listconseillers.component';
import { CreateconseillerComponent } from './createconseiller/createconseiller.component';
import { UpdateconseillerComponent } from './updateconseiller/updateconseiller.component';
import { VirementComponent } from './virement/virement.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { ParametrageComponent } from './parametrage/parametrage.component';
import { RapporttransactionComponent } from './rapporttransaction/rapporttransaction.component';


const routes: Routes = [
  {path :"", component: AuthentificationComponent},
  {path:"listClients", component : ListclientsComponent},
  {path:"nouveauClient", component : CreateclientComponent},
  {path:"modifierClient/:id", component : UpdateclientComponent},
  {path:"listConseillers", component : ListconseillersComponent},
  {path:"nouveauConseiller", component : CreateconseillerComponent},
  {path:"modifierConseiller/:id", component : UpdateconseillerComponent},
  {path:"listComptes", component : UpdateconseillerComponent},
  {path:"virement", component : VirementComponent},
  {path:"parametre", component : ParametrageComponent},
  {path:"rapport", component : RapporttransactionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

}
