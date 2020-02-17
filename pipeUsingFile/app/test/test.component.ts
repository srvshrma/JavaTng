import { Component, OnInit, Input, Output } from "@angular/core";
import { EventEmitter } from '@angular/core';
import { DatePipe } from '@angular/common';

@Component({
  selector: "app-test",
  template: `
   <h4>{{name | uppercase}}</h4>
   <h4>{{name | lowercase}}</h4>
   <h4>{{name | titlecase}}</h4>
   <br>
   <h4>{{person | json}}</h4>
   <br>
   <h4>{{.75 | percent}}</h4>
   <h4>{{25000 | currency}}</h4>
   <h4>{{25000 | currency:'INR'}}</h4>
   <h4>{{25000 | currency:'INR' : 'code'}}</h4>
   <h4>{{25000 | currency:'GBP'}}</h4>
   <br>
   <h4>{{currentDate}}</h4>
   <h4>{{currentDate | date : 'shortDate'}}</h4>
   <h4>{{currentDate | date : 'longDate'}}</h4>
   <h4>{{currentDate | date : 'longTime'}}</h4>
   <br>
   <h4>{{123.123 | number : '2.1-2'}}</h4>
   <h4>{{123.123 | number : '5.3-4'}}</h4>
   <h4>{{123.123 | number : '1.1-4'}}</h4>

  `,

  styleUrls: ["./test.component.css"]
})
export class TestComponent implements OnInit {
 name="saurav sharma"
 person={
   name:"saurav",
   email:"srv@srv",
   salary:12000
 }
 currentDate= new Date();
 
  constructor() {
   
  }

  ngOnInit(): void {}
}
