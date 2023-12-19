package com.javabrains.controller;

import com.javabrains.dtos.CreateMovieRequest;
import com.javabrains.model.Movie;
import com.javabrains.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MovieController {


    MovieService movieService;


    @PostMapping("/movie")
    public Movie createMovie(@RequestBody CreateMovieRequest createMovieRequest){
        return movieService.saveMovie(createMovieRequest.toMovie());
    }

}
