package com.javabrains.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "hall")
public class Hall extends BaseModel {

    @ManyToOne
    private Theatre theatre;

    @OneToMany
    private List<Show> shows;

    @OneToMany
    private List<Seats>seats;

}