package com.javabrains.model;

import com.javabrains.enums.Language;
import com.javabrains.enums.MovieFeature;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "shows")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Show extends BaseModel {

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Hall hall;

    @Enumerated
    private Language language;

    @OneToMany
    private List<ShowSeats> showSeats;

    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();

    private Date startTime;
    private Integer duration;



}