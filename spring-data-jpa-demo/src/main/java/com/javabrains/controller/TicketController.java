package com.javabrains.controller;


import com.javabrains.dtos.CreateBookingRequest;
import com.javabrains.dtos.CreateShowRequest;
import com.javabrains.dtos.GetShowResponse;
import com.javabrains.dtos.GetTicketResponse;
import com.javabrains.model.Ticket;
import com.javabrains.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TicketController {

    TicketService ticketService;

    @PostMapping("/ticket")
    public GetTicketResponse createShow(@RequestBody CreateBookingRequest createBookingRequest)  {
        return ticketService.createBooking(createBookingRequest);
    }

}
