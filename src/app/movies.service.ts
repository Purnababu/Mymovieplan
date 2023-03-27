import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movies } from './movies';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {
    
    baseUrl:string="http://localhost:8080/api/movieslist"
  constructor(private http:HttpClient) { }
    
  getmovieslist():Observable<Movies[]>{
    return this.http.get<Movies[]>(this.baseUrl);
  }



}
