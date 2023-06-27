package com.movie.movieservice.repository;

import com.movie.movieservice.data.MovieCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCategoryRepository extends JpaRepository<Long, MovieCategory> {
}
