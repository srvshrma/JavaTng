import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { IEmp } from '../emp.model';

@Component({
  selector: 'app-emp',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css'],
  providers:[DataService]
})
export class EmpComponent implements OnInit {
  public emp:IEmp[]=[];
  constructor(private dataService:DataService) { }

  ngOnInit(): void {
    this.dataService.getEmployees1().subscribe(
      data => this.emp=data
    );
  }

}
