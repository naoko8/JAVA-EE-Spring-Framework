package com.example.ninopotskhishvili.controller;

import com.example.ninopotskhishvili.dto.*;
import com.example.ninopotskhishvili.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("addMovie")
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        return movieService.addMovie(addMovieInput);
    }

    @GetMapping("deleteMovie")
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        return movieService.deleteMovie(deleteMovieInput);
    }

    @GetMapping("getMovie")
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        return movieService.getMovie(getMovieInput);
    }

    @GetMapping("getMovies")
    public GetMoviesOutput getMoviess(GetMoviesInput getMoviesInput) {
        return movieService.getMoviess(getMoviesInput);
    }
}
