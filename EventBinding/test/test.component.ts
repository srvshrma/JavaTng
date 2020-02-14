import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
   <button (click)="onButtonClicked($event)">Click</button>
   <button (dblclick)="onButtonClicked($event)">Double Click</button>
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  onButtonClicked(event){
    console.log(event);
    console.log(event.type);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
