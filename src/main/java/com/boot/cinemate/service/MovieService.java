package com.boot.cinemate.service;

import com.boot.cinemate.entity.Movie;
import com.boot.cinemate.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll(); // 모든 영화 조회
    }

    public void saveMovie(Movie movie) {
        movieRepository.save(movie); // 새로운 영화 저장
    }
}
