import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {TitlePipe} from './title.pipe';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms'
import { TestComponent } from './test/test.component';

@NgModule({
  declarations: [
    AppComponent,
    TitlePipe,
    TestComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
