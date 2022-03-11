package com.plv.plmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plv.plmovie.entities.Score;
import com.plv.plmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
