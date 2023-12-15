package com.javabrains.model;

import com.javabrains.enums.ShowSeatsStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="showseats")
public class ShowSeats extends BaseModel{

    private Double price;

    @ManyToOne
    private Show show;

    @ManyToOne
    private Seats seat;


    @Enumerated
    private ShowSeatsStatus showSeatsStatus;

}
