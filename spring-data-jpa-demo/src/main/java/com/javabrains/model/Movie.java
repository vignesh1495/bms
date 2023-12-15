package com.javabrains.model;

import com.javabrains.enums.Language;
import com.javabrains.enums.MovieFeature;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie extends BaseModel {

        private String name;
        private Double rating;
        @ElementCollection
        @Enumerated
        private List<Language> languages = new ArrayList<>();
        @ElementCollection
        @Enumerated
        private List<MovieFeature> features = new ArrayList<>();

}