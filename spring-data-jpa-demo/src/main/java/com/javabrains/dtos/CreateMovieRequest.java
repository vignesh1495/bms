package com.javabrains.dtos;

import com.javabrains.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMovieRequest {

    String name;
    Integer ratings;

    public Movie toMovie(){
        return Movie.builder().name(this.name).rating(this.ratings).build();
    }

}
