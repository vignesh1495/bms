package com.javabrains.dtos;


import com.javabrains.model.Theatre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTheatreRequest {

    String name;
    String address;
    String city;


    public Theatre toTheatre(){
        return  Theatre.builder().name(name).address(address).build();
    }

}
