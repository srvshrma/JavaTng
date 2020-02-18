import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DataService {
  private _url="http://jsonplaceholder.typicode.com/posts"
  constructor(private http:HttpClient) { }

  getEmployees():Observable<any[]>{
    return this.http.get<any[]>(this._url) ;
  }
}
