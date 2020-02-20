import { Component, OnInit } from '@angular/core';

import { User } from 'src/app/model/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  public categories=['Bakery','Drinks','Deserts']
  public user=new User('','','','','','',false);
  constructor() { }

  ngOnInit(): void {
  }
  onsubmit(){
    console.log(this.user);
  }
}
