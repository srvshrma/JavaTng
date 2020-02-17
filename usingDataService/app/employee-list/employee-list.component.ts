import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  
public employees=[];
constructor(private dataService: DataService) { 
    
}

ngOnInit(): void {
  this.employees=this.dataService.getEmployees();
}

}
