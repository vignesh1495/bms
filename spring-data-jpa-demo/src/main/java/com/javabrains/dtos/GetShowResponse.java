package com.javabrains.dtos;


import com.javabrains.model.City;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetShowResponse {

    Long id;
    String theatreName;
    String city;


    public GetShowResponse(Long id, String name, City city) {
        this.id=id;
        this.theatreName=name;
        this.city=city.getName();
    }
}
