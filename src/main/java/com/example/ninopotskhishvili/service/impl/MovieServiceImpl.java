package com.example.ninopotskhishvili.service.impl;

import com.example.ninopotskhishvili.dto.*;
import com.example.ninopotskhishvili.model.Movie;
import com.example.ninopotskhishvili.repository.MovieRepository;
import com.example.ninopotskhishvili.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());
        movieRepository.save(movie);
        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setMsg("done");
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getOne(deleteMovieInput.getMovieId());
        movieRepository.delete(movie);
        DeleteMovieOutput deleteMovieOutput = new DeleteMovieOutput();
        deleteMovieOutput.setMsg("done");
        return deleteMovieOutput;
    }

    @Override
    public GetMovieOutput getMovie(GetMovieInput getMovieInput) {
        Movie movie = movieRepository.getOne(getMovieInput.getMovieId());
        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setTitle(movie.getTitle());
        getMovieOutput.setCountry(movie.getCountry());
        return getMovieOutput;
    }

    @Override
    public GetMoviesOutput getMoviess(GetMoviesInput getMoviesInput) {
        List<MovieDTO> movieDTOS = new ArrayList<>();
        GetMoviesOutput getMoviesOutput = new GetMoviesOutput();
        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTOS.add(movieDTO);
        }
        getMoviesOutput.setMovieDTOList(movieDTOS);
        return getMoviesOutput;
    }
}
