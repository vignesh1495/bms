package com.javabrains.service;

import com.javabrains.Repository.HallRepository;
import com.javabrains.Repository.SeatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SeatService {

        SeatRepository seatRepository;

}
