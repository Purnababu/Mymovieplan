package com.example.MyMoviePlan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Medicare.model.Admin;
@Repository
public interface adminrepo extends JpaRepository<Admin,Integer> {

}
