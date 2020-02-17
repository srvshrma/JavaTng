import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-test",
  template: `
    <h1>Template Reference Variable</h1>
    <input type="text" #myinput/>
    <button class="btn btn-primary" (click)=onClick(myinput.value)>Click</button><br><br>

    <h1>Two Way Data Binding</h1>
    <h3>{{name}}</h3>
    <input type="text" [(ngModel)]="name"/>

  
  `,

  styleUrls: ["./test.component.css"]
})
export class TestComponent implements OnInit {
 
  name="Saurav";
  onClick(value){
    console.log(value);
  }

  
  constructor() {
   
  }

  ngOnInit(): void {}
}
