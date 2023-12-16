package com.javabrains.controller;

import com.javabrains.dtos.CreateHallRequest;
import com.javabrains.dtos.GetHallResponse;
import com.javabrains.service.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HallController {


    HallService hallService;
    @PostMapping("/hall")
    public GetHallResponse createHall(@RequestBody CreateHallRequest createHallRequest){
            return hallService.createHall(createHallRequest);
    }


}
