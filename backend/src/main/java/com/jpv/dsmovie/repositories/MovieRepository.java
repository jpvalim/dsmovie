package com.jpv.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
