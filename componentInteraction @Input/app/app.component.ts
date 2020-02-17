import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  title = "webpage";
  identity= {
    firstName: "Saurav",
    lastName: "Sharma",
    email: "saurav@srv.com"
  }
}
