import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "webpage";
 public employees=[{ "empId":1,"name":"Saurav","gender":"M","salary":"50000","dateOfBirth":"11/05/1997"},
 { "empId":2,"name":"Rahul","gender":"M","salary":"5","dateOfBirth":"11/09/1997"},
 { "empId":3,"name":"Tanishka","gender":"F","salary":"500","dateOfBirth":"08/22/1997"},
 { "empId":4,"name":"Shorya","gender":"F","salary":"20","dateOfBirth":"06/30/1997"}

]
}
