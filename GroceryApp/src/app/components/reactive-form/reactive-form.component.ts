import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,Validators} from '@angular/forms';
@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  userForm=new FormGroup({
    email:new FormControl(null,Validators.required),
    password: new FormControl(null,[Validators.required,Validators.minLength(3),Validators.maxLength(10)]),
    address: new FormGroup({
      house: new FormControl(),
      city:new FormControl(),
      country: new FormControl()
    })

  })
  loadData(){
    this.userForm.setValue({                    //We can use patchValue({})instead of setValue if we wish to skip any values in form.
      email:'saurav@srv.com',
      password:'sasasasa',
      address:{
        house:'1',
        city:'Gurgaon',
        country:'India'
      }
    })
  }
  constructor() { }

  ngOnInit(): void {
  }
  
}
