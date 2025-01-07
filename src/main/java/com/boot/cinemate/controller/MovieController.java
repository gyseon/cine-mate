package com.boot.cinemate.controller;

import com.boot.cinemate.dto.MovieDto;
import com.boot.cinemate.service.MovieService;
import com.boot.cinemate.service.TmdbService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    private final TmdbService tmdbService;

    public MovieController(MovieService movieService, TmdbService tmdbService) {
        this.movieService = movieService;
        this.tmdbService = tmdbService;
    }

    @GetMapping("/movieList")
    public String getMovies(Model model) {

        List<MovieDto> movies = tmdbService.getPopularMovies();
        model.addAttribute("movies", movies); // 데이터를 View로 전달
        return "movies"; // popular-movies.html을 렌더링
    }
}
