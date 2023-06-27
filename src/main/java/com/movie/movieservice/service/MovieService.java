package com.movie.movieservice.service;

import com.movie.movieservice.bean.MovieResponse;
import com.movie.movieservice.dto.MovieDto;

import java.util.List;

public interface MovieService {

    MovieResponse getMovieWithId(Long id) throws Exception;
    List<MovieResponse> getAllMovies();

    MovieResponse createMovie(MovieDto dto);

    String updateMovie(MovieDto dto);

    void deleteMovie(Long id);
}
