package com.javabrains.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.javabrains.enums.SeatType;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="seats")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seats extends BaseModel {

    private String name;

    @Enumerated
    private SeatType seatType;

    @ManyToOne
    @JsonIgnore
    private Hall hall;

}
