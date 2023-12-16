package com.javabrains.controller;



import com.javabrains.dtos.CreateTheatreRequest;
import com.javabrains.dtos.CreateUserRequest;
import com.javabrains.dtos.GetTheatreResponse;
import com.javabrains.dtos.GetUserResponse;
import com.javabrains.service.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TheatreController {

    TheatreService theatreService;

    @PostMapping("/theatre")
    public GetTheatreResponse GetUserResponse(@RequestBody CreateTheatreRequest createTheatreRequest){

        return   theatreService.saveTheatre(createTheatreRequest);

    }


}
