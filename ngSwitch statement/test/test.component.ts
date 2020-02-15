import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <div [ngSwitch]="number">
    <h1>Your Number is: </h1>
    <h1 *ngSwitchCase="'one'">1</h1>
    <h1 *ngSwitchCase="'two'">2</h1>
    <h1 *ngSwitchCase="'three'">3</h1>
    <h1 *ngSwitchCase="'four'">4</h1>
    <h1 *ngSwitchCase="'five'">5</h1>
    <h1 *ngSwitchDefault>Not present the list</h1>
   </div>

   <div [ngSwitch]="numberWord">
    <h1 *ngSwitchCase="1">One</h1>
    <h1 *ngSwitchCase="2">Two</h1>
    <h1 *ngSwitchCase="3">Three</h1>
    <h1 *ngSwitchCase="4">Four</h1>
    <h1 *ngSwitchCase="5">Five</h1>
    <h1 *ngSwitchDefault>Not present the list</h1>
   </div>
  `,
  
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  number="two"
  numberWord=2
  constructor() { }

  ngOnInit(): void {
  }

}
