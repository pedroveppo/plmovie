package com.plv.plmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plv.plmovie.dto.MovieDTO;
import com.plv.plmovie.services.MovieServices;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	private MovieServices movieService;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable){
		return movieService.findAll(pageable);
	}
}
