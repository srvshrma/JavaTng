import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {TitlePipe} from './title.pipe';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms'
import { TestComponent } from './test/test.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import {HttpClientModule} from '@angular/common/http'
@NgModule({
  declarations: [
    AppComponent,
    TitlePipe,
    TestComponent,
    EmployeeComponent,
    EmployeeListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
