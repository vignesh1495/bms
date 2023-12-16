package com.javabrains.dtos;


import com.javabrains.model.City;
import com.javabrains.model.Hall;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTheatreResponse {


    private String name;
    private String address;
    private List<Hall> halls;
    private City city;



}
