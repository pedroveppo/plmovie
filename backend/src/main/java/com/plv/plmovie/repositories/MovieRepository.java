package com.plv.plmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plv.plmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
