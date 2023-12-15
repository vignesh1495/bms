package com.javabrains.dtos;

import com.javabrains.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponse {

    private Long id;
    private String firstname;
    private String lastname;
    private String address;


    public GetUserResponse(User userEntity) {
        this.id=userEntity.id;
        this.firstname=userEntity.getFirstname();
        this.lastname=userEntity.getLastname();
        this.address=userEntity.getAddress();
    }
}
