import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,Validators} from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public userForm: FormGroup;

  constructor(private builder:FormBuilder) { }

  ngOnInit(): void {
    this.createForm()
  }
  createForm(){
    this.userForm=this.builder.group({
      'email':[null,Validators.required],
      'password':[null,Validators.required]
    })
  }
  onSubmit(data){
    console.log(data)
  }
}
