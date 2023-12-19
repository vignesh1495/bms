package com.javabrains.controller;


import com.javabrains.Exception.MovieNotFoundException;
import com.javabrains.dtos.CreateShowRequest;
import com.javabrains.dtos.GetShowResponse;
import com.javabrains.service.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ShowController {


    private ShowService showService;

    @PostMapping("/show")
    public GetShowResponse createShow(@RequestBody  CreateShowRequest createShowRequest)  {
        return showService.createShow(createShowRequest);
    }

}
