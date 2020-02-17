import { Component, OnInit, Input } from "@angular/core";

@Component({
  selector: "app-test",
  template: `
   
   <h2>First Name: {{parentData.firstName}} </h2>
   <h2> Last Name: {{parentData.lastName}} </h2>
   <h2> Email: {{parentData.email}} </h2>
  `,

  styleUrls: ["./test.component.css"]
})
export class TestComponent implements OnInit {
 
  @Input()
  public parentData
  
  constructor() {
   
  }

  ngOnInit(): void {}
}
