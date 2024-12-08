package com.javabrains.controller;


import com.javabrains.dtos.CreateCityRequest;
import com.javabrains.dtos.CreateUserRequest;
import com.javabrains.dtos.GetCityResponse;
import com.javabrains.dtos.GetUserResponse;
import com.javabrains.model.City;
import com.javabrains.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CityController {


    CityService cityService;

    @PostMapping("/city")
    public GetCityResponse GetCityResponse(@RequestBody CreateCityRequest createCityRequest){

       return cityService.saveCity(createCityRequest.toCity());




    }



}
