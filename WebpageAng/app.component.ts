import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  <h1> App Component </h1>
  <h2>Saurav</h2>
  <h2>{{name}}</h2>
  <h3>{{"Hey "+ name}}</h3>
  <h5>{{"Length= "+name.length}}</h5>
  <h2>{{name.toUpperCase()}}</h2>
  <h1>{{getMsg()}}</h1>
  `,
  styleUrls: ['./app.component.css']

})
export class AppComponent {
  title = 'webpage';
  name="Saurav Sharma";
  getMsg(){
    return "Welcome "+this.name;
  }
}
