package com.boot.cinemate.dto;

import com.boot.cinemate.entity.Movie;
import lombok.Getter;

@Getter
public class MovieDto {
    private String title;
    private String genre;
    private String releaseDate;
    private String overview;

    public MovieDto(Movie movie) {
        this.title = movie.getTitle();
        this.genre = movie.getGenre();
        this.releaseDate = movie.getReleaseDate();
        this.overview = movie.getOverview();
    }

}
