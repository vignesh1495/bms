package com.javabrains.model;


import com.javabrains.enums.SeatType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="seats")
public class Seats extends BaseModel {

    private String name;

    @Enumerated
    private SeatType seatType;

    @ManyToOne
    private Hall hall;

}
