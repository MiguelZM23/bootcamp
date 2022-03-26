import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { CommonServicesModule } from '../common-services';
import { MyCoreModule } from 'src/lib/my-core';

import { CONTACTOS_COMPONENTES } from './componente.component';



@NgModule({
  declarations: [
    CONTACTOS_COMPONENTES
  ],
  exports: [],
  imports: [
    CommonModule, FormsModule, RouterModule.forChild([]),
    MyCoreModule, CommonServicesModule
  ]
})
export class ContactosModule { }