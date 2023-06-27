package com.movie.movieservice.service.serviceImpl;

import com.movie.movieservice.bean.MovieResponse;
import com.movie.movieservice.data.Movie;
import com.movie.movieservice.dto.MovieDto;
import com.movie.movieservice.repository.MovieCategoryRepository;
import com.movie.movieservice.repository.MovieRepository;
import com.movie.movieservice.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;
    private final MovieCategoryRepository categoryRepository;

    public MovieServiceImpl(MovieRepository repository, MovieCategoryRepository categoryRepository) {
        this.repository = repository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public MovieResponse getMovieWithId(Long id) throws Exception {
        Optional<Movie> movieOptional = repository.findById(id);
        MovieResponse response = new MovieResponse();
        List<String> list = new ArrayList<>();
        if(!movieOptional.isPresent()){
            throw new Exception("Movie not exists with this id: "+id);
        }
        response.setName(movieOptional.get().getName());
        response.setDescription(movieOptional.get().getDescription());
        movieOptional.get().getMovieCategoryList().forEach(x -> list.add(String.valueOf(x.getName())));

        return response;
    }

    @Override
    public List<MovieResponse> getAllMovies() {
        List<MovieResponse> movieResponses = new ArrayList<>();
        List<Movie> movies = repository.findAll();
        return null;
    }

    @Override
    public MovieResponse createMovie(MovieDto dto) {
        return null;
    }

    @Override
    public String updateMovie(MovieDto dto) {
        return null;
    }

    @Override
    public void deleteMovie(Long id) {

    }
}
