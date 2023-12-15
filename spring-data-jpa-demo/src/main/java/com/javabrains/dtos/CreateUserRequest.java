package com.javabrains.dtos;

import com.javabrains.model.User;
import lombok.Data;

@Data
public class CreateUserRequest {

    private String firstname;
    private String lastname;
    private String password;
    private String address;

    public User toUser(){
        return new User(firstname,lastname,password,address);
    }


}
