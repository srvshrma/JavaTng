import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <div>
    <h1 *ngIf="hasError">Hello from if</h1>
    <h1 *ngIf="!hasError">Hello from else</h1>
    </div><br>
    <h2 *ngIf="hasError;else:elseBlock;then:ifBlock"></h2>
    <ng-template #ifBlock>
    <h2>Hello from another if</h2>
    </ng-template>
    <ng-template #elseBlock>
    <h2>Hello from another else</h2>
    </ng-template>
    <br>
    <button *ngIf="!isLoggedIn" class="btn btn-primary">Login</button>
    <button *ngIf="isLoggedIn" class="btn btn-danger">Logout</button>
  `,
  
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
 hasError=true
 isLoggedIn=true
  constructor() { }

  ngOnInit(): void {
  }

}
