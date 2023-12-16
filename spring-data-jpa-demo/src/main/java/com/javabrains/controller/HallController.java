package com.javabrains.controller;

import com.javabrains.service.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HallController {


    HallService hallService;

    public GetHallResponse createHall(){

    }


}
