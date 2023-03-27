import { Component } from '@angular/core';
import { Movies } from '../movies';
import { MoviesService } from '../movies.service';

@Component({
  selector: 'app-movies-list',
  templateUrl: './movies-list.component.html',
  styleUrls: ['./movies-list.component.css']
})
export class MoviesListComponent {
        
        mvs:Movies[]=[]
     constructor(private servicee:MoviesService){}

     ngOnInit(){
         this.servicee.getmovieslist().subscribe(data=>this.mvs=data);
     }

}
