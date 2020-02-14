import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <h1 class="text-special">Welcome Saurav</h1>
  <h2 [class]="classSuccess">SRV</h2>
  <h3 [class.text-success]="hasError">This is error</h3>
  <h1 [ngClass]="message">Hey</h1>
  `,
  
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
 classSuccess="text-success"
 hasLine=false
 hasError=true
 message={
   'text-success':this.hasError,
   'text-danger':this.hasError,
   'text-underline':this.hasLine,
 }
  constructor() { }

  ngOnInit(): void {
  }

}
