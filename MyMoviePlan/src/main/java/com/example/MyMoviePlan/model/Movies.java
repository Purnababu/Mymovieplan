package com.example.MyMoviePlan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Movies {
     @Id
     @GeneratedValue
	private int id;
	private String MovieName;
	private int year;
	private int amout;
	private String Showtime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getAmout() {
		return amout;
	}

	public void setAmout(int amout) {
		this.amout = amout;
	}

	public String getShowtime() {
		return Showtime;
	}

	public void setShowtime(String showtime) {
		Showtime = showtime;
	}

}