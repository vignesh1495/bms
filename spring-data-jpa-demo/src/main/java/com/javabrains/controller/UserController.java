package com.javabrains.controller;


import com.javabrains.dtos.CreateUserRequest;
import com.javabrains.dtos.GetUserResponse;
import com.javabrains.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class UserController {


    UserService userService;

    @PostMapping("/user")
   public GetUserResponse GetUserResponse(@RequestBody  CreateUserRequest createUserRequest){

      return   userService.saveUser(createUserRequest.toUser());

    }

    @GetMapping("/getUser")
    public String getUser(){

        return "Vignesh";
    }



}
