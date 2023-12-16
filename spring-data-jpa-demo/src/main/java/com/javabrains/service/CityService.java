package com.javabrains.service;


import com.javabrains.Exception.CityNotFoundException;
import com.javabrains.Repository.CityRepository;
import com.javabrains.dtos.GetCityResponse;
import com.javabrains.model.City;
import com.javabrains.model.Theatre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CityService {

    CityRepository cityRepository;

    public GetCityResponse saveCity(City city){
       City cityResponse = cityRepository.findByName(city.getName()).orElseGet(()->cityRepository.save(city));
        return new GetCityResponse(cityResponse.getName(),cityResponse.getTheatres());
    }

    public City getCityByNameInternal(String city) {
        return cityRepository.findByName(city).get();
    }

    public City getCityByName(String city) throws Exception {
        return cityRepository.findByName(city).orElseThrow(()->
                new CityNotFoundException(city+" :not found"));
    }

    public void addTheatre(City city, Theatre theatre)  {
        List<Theatre> theatreList= getCityByNameInternal(city.getName()).getTheatres();
        for(int i=0;i<theatreList.size();i++){
            if(theatreList.get(i).getName().equals(theatre.getName())){
                return;
            }
        }
        theatreList.add(theatre);
        city.setTheatres(theatreList);
        cityRepository.save(city);
    }
}
