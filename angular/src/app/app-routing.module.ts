import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//módulo de enrutado

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
