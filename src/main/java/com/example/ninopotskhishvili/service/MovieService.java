package com.example.ninopotskhishvili.service;

import com.example.ninopotskhishvili.dto.*;

public interface MovieService {
    AddMovieOutput addMovie(AddMovieInput addMovieInput);

    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);

    GetMovieOutput getMovie(GetMovieInput getMovieInput);

    GetMoviesOutput getMoviess(GetMoviesInput getMoviesInput);
}
