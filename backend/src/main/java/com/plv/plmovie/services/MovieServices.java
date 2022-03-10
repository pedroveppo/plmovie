package com.plv.plmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plv.plmovie.dto.MovieDTO;
import com.plv.plmovie.entities.Movie;
import com.plv.plmovie.repositories.MovieRepository;

@Service
public class MovieServices {

	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {		
		Page<Movie> result = movieRepository.findAll(pageable);
		Page<MovieDTO> moviesResult = result.map(x -> new MovieDTO(x));
		return moviesResult;	
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {		
		Movie result = movieRepository.findById(id).get();
		MovieDTO movieResult = new MovieDTO(result);
		return movieResult;	
	}
}
