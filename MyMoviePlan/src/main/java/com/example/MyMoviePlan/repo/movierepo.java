package com.example.MyMoviePlan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MyMoviePlan.model.Movies;
@Repository
public interface movierepo  extends JpaRepository<Movies,Integer>{

}
