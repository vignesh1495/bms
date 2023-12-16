package com.javabrains.dtos;

import com.javabrains.model.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCityRequest {

    String name;


    public City toCity(){
        return  City.builder().name(name).build();
    }

}
