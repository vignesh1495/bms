package com.javabrains.service;


import com.javabrains.Exception.MovieNotFoundException;
import com.javabrains.Repository.MovieRepository;
import com.javabrains.model.Movie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService {

    MovieRepository movieRepository;

    public Movie getMovieByName(String movieName) throws MovieNotFoundException {
       Optional<Movie> movie= movieRepository.findByName(movieName);
       if(!movie.isPresent()){
           System.out.println("Movie not available");
           throw new MovieNotFoundException("Movie not available");
       }
        return movie.get();
    }

    public Movie saveMovie(Movie movie){
        System.out.println(movie.toString());
        return  movieRepository.save(movie);
    }
}
