package com.jpv.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.dsmovie.entities.Score;
import com.jpv.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
