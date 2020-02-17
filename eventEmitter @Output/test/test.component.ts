import { Component, OnInit, Input, Output } from "@angular/core";
import { EventEmitter } from '@angular/core';

@Component({
  selector: "app-test",
  template: `
   
   <h2>Test Component</h2>
    <button class="btn btn-danger" (click)="onClick()">Click</button>
  `,

  styleUrls: ["./test.component.css"]
})
export class TestComponent implements OnInit {
 @Output()
 public childEvent=new EventEmitter();
  onClick(){
    this.childEvent.emit("Data from child")
  }
  constructor() {
   
  }

  ngOnInit(): void {}
}
