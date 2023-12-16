package com.javabrains.dtos;

import com.javabrains.enums.SeatType;
import com.javabrains.model.Hall;
import com.javabrains.model.Seats;
import com.javabrains.model.Show;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateHallRequest {

    String theatreName;
    int seatNumber;
    List<Seats>seats=new ArrayList<>();

    public Seats createSeats(int i){
        //for(int i=0;i<seatNumber;i++){
         return   Seats.builder().name("A"+i).seatType(SeatType.NORMAL).build();
        //}
    }

    public Hall toHall(){
        Hall hall = new Hall();
        return hall;
    }


}
