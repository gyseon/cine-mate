package com.boot.cinemate.service;

import com.boot.cinemate.dto.MovieDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TmdbService {

    @Value("${tmdb.api.key}")
    private String apiKey;

    @Value("${tmdb.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public TmdbService() {
        this.restTemplate = new RestTemplate();
    }

    public List<MovieDto> getPopularMovies() {
        String url = String.format("%s/movie/popular?api_key=%s", apiUrl, apiKey);

        // TMDB API 호출
        MovieDto[] response = restTemplate.getForObject(url, MovieDto[].class);

        // 응답 데이터 반환
        return Arrays.asList(response);
    }
}
