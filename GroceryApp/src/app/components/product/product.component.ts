import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
public subCategory:any;
public product:any;
public img_src="http://rjtmobile.com/grocery/images/";
  constructor(private dataService:DataService) { }

  ngOnInit(): void {
    this.dataService.getSubCategory(1).subscribe(
      y=> this.subCategory =y.data
    );
    this.dataService.getProduct(1).subscribe(
      z=>this.product =z.data
    );
  }

}
