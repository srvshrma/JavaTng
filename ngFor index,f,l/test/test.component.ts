import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-test",
  templateUrl: "./test.component.html",

  styleUrls: ["./test.component.css"]
})
export class TestComponent implements OnInit {
  names = ["Saurav", "Rahul", "Juned"];
  employees = [];

  constructor() {
    this.employees = [
      { empId: "1", empName: "Saurav", age: 22 },
      { empId: "2", empName: "Rahul", age: 52 }
    ];
  }

  onClicked() {
    this.employees = [
      { empId: "1", empName: "Saurav", age: 22 },
      { empId: "2", empName: "Rahul", age: 52 },
      { empId: "3", empName: "Juned", age: 32 }
    ];
  }
  trackByEmpId(emp, index) {
    return emp.empId;
  }
  ngOnInit(): void {}
}
