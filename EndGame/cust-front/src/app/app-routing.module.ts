import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustDetailsComponent } from './cust-details/cust-details.component';
import { CustListComponent } from './cust-list/cust-list.component';
import { CustRegisterComponent } from './cust-register/cust-register.component';

const routes: Routes = [
  {path:"app-cust-details",component:CustDetailsComponent},
  {path:"app-cust-list",component:CustListComponent},
  {path:"app-cust-register",component:CustRegisterComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
