package com.javabrains.service;


import com.javabrains.Exception.CityNotFoundException;
import com.javabrains.Repository.TheatreRepository;
import com.javabrains.dtos.CreateCityRequest;
import com.javabrains.dtos.CreateTheatreRequest;
import com.javabrains.dtos.GetTheatreResponse;
import com.javabrains.model.City;
import com.javabrains.model.Theatre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TheatreService {

    TheatreRepository theatreRepository;

    CityService cityService;

    public GetTheatreResponse saveTheatre(CreateTheatreRequest createTheatreRequest) {
        try {
            City city = cityService.getCityByName(createTheatreRequest.getCity());
            Theatre theatre= createTheatreRequest.toTheatre();
            theatre.setCity(city);
            Theatre newTheatre = theatreRepository.findByName(createTheatreRequest.getName()).orElseGet(() -> theatreRepository.save(theatre));
            cityService.addTheatre(city,newTheatre);
            return new GetTheatreResponse(newTheatre.getName(), newTheatre.getAddress(), newTheatre.getHalls(), newTheatre.getCity());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new GetTheatreResponse();
    }

    public Theatre getTheatre(String name){
        return theatreRepository.findByName(name).get();
    }

}
