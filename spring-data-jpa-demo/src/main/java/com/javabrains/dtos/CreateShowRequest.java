package com.javabrains.dtos;


import com.javabrains.enums.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateShowRequest {

    String movieName;
    Long hallId;
    Language language;




}
