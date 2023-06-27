package com.movie.movieservice.repository;

import com.movie.movieservice.data.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
