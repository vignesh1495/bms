package com.javabrains.model;

import com.javabrains.enums.Language;
import com.javabrains.enums.MovieFeature;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie extends BaseModel {

        private String name;
        private Integer rating;
        @ElementCollection
        @Enumerated
        private List<Language> languages = new ArrayList<>();
        @ElementCollection
        @Enumerated
        private List<MovieFeature> features = new ArrayList<>();

}