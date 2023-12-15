package com.javabrains.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "shows")
public class Show extends BaseModel {

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Hall hall;

    @OneToMany
    private List<Seats> seats;

    private Date startTime;
    private Integer duration;



}