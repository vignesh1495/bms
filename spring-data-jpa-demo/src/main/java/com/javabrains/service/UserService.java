package com.javabrains.service;

import com.javabrains.Exception.NoUserFoundException;
import com.javabrains.Repository.UserRepository;
import com.javabrains.dtos.GetUserResponse;
import com.javabrains.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService {


    UserRepository userRepository;

    public GetUserResponse saveUser(User user){
        User userEntity =  userRepository.save(user);
       return new GetUserResponse(userEntity);
    }

    public User getUserByName(String userName) {
        return userRepository.findByfirstname(userName).orElseThrow(()->  new NoUserFoundException());
    }
}
