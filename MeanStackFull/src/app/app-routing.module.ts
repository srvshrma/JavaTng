import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './component/employee-list/employee-list.component';
import { EmployeeCreateComponent } from './component/employee-create/employee-create.component';
import { EmployeeDeleteComponent } from './component/employee-delete/employee-delete.component';
import { EmployeeEditComponent } from './component/employee-edit/employee-edit.component';


const routes: Routes = [
  {path:'' , component:EmployeeListComponent},
  {path:'create', component:EmployeeCreateComponent},
  {path:'edit', component:EmployeeEditComponent},
  {path:'delete', component:EmployeeDeleteComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
