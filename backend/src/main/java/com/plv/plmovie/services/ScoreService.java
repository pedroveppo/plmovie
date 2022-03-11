package com.plv.plmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plv.plmovie.dto.MovieDTO;
import com.plv.plmovie.dto.ScoreDTO;
import com.plv.plmovie.entities.Movie;
import com.plv.plmovie.entities.Score;
import com.plv.plmovie.entities.User;
import com.plv.plmovie.repositories.MovieRepository;
import com.plv.plmovie.repositories.ScoreRepository;
import com.plv.plmovie.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional(readOnly = true)
	public MovieDTO saveScore(ScoreDTO scoreDto) {		
		User user = userRepository.findByEmail(scoreDto.getEmail());
		
		if (user == null) {
			user = new User();
			user.setEmail(scoreDto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(scoreDto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(scoreDto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum += s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
}
