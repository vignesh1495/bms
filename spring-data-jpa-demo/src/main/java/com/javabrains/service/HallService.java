package com.javabrains.service;

import com.javabrains.Repository.HallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HallService {

        HallRepository hallRepository;

}
