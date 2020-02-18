import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { IEmp } from './emp.model';
@Injectable({
  providedIn: 'root'
})
export class DataService {
  private _url="http://jsonplaceholder.typicode.com/posts"
  
  constructor(private http:HttpClient) { }

 // getEmployees():Observable<any[]>{
 //   return this.http.get<any[]>(this._url) ;

 // }
  getEmployees1():Observable<IEmp[]>{
    return this.http.get<IEmp[]>(this._url);

  }  
  
}
