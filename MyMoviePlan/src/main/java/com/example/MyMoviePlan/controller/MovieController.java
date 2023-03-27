package com.example.MyMoviePlan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyMoviePlan.model.Movies;
import com.example.MyMoviePlan.repo.movierepo;

@RestController
@RequestMapping("/api/movieslist")
@CrossOrigin("http://loclahost:4200")

public class MovieController {
	@Autowired
	movierepo mrepo;
	@GetMapping("")
	public List<Movies> getMovies(){
		 return mrepo.findAll();
		
	}
	
	

}
