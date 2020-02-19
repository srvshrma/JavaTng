import { Component, OnInit } from "@angular/core";
import { DataService } from "src/app/services/data.service";
import { ActivatedRoute } from "@angular/router";

@Component({
  selector: "app-product",
  templateUrl: "./product.component.html",
  styleUrls: ["./product.component.css"]
})
export class ProductComponent implements OnInit {
  public catId;
  public subCategory: any;
  public product: any;
  public img_src = "http://rjtmobile.com/grocery/images/";
  constructor(private dataService: DataService, private route: ActivatedRoute) {
    this.catId = this.route.snapshot.paramMap.get("id");
  }

  ngOnInit(): void {
    this.dataService
      .getSubCategory(this.catId)
      .subscribe(y => (this.subCategory = y.data));
    this.dataService.getProduct(1).subscribe(z => (this.product = z.data));
  }

  addToCart(prod) {
    if (localStorage.cart == undefined) {
      console.log(prod);
      var cartItems = [];
      cartItems.push(prod);
      localStorage.cart = JSON.stringify(cartItems);
    } else {
      var products: any[] = JSON.parse(localStorage.cart);
      products.push(prod);
      localStorage.cart = JSON.stringify(products);
    }
  }
  onSelectSubCategory(subId) {
    console.log(subId);
    this.dataService.getProduct(subId).subscribe(a => (this.product = a.data));
  }
}
