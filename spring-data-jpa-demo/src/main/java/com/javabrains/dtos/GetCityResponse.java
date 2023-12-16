package com.javabrains.dtos;

import com.javabrains.model.City;
import com.javabrains.model.Theatre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCityResponse {

    String name;
    List<Theatre> theatres;


}
