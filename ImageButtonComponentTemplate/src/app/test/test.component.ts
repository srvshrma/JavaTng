import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  
    <img [src]="imagePath"/>
    <img src="{{imagePath}}"/><br>
    
    <button disabled>Click</button>
    <button disabled={{isDisabled}}>click</button>
    <button [disabled]="isDisabled">click</button>
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  imagePath='../assets/img/logo.png'
  isDisabled=false;
  constructor() { }

  ngOnInit(): void {
  }

}
