import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl:'./test.component.html' ,
  
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  names=["Saurav","Rahul","Juned"]

  employees=[{"empId":"1","empName":"Saurav","age":22},
            {"empId":"2","empName":"Rahul","age":52},
            
]
  constructor() { }

  ngOnInit(): void {
  }

}
