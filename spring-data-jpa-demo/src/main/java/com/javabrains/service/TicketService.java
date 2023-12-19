package com.javabrains.service;


import com.javabrains.Exception.ShowSeatNotAvailableException;
import com.javabrains.Repository.ShowSeatsRepository;
import com.javabrains.Repository.TicketRepository;
import com.javabrains.dtos.CreateBookingRequest;
import com.javabrains.dtos.GetTicketResponse;
import com.javabrains.enums.ShowSeatsStatus;
import com.javabrains.enums.TicketStatus;
import com.javabrains.model.Show;
import com.javabrains.model.ShowSeats;
import com.javabrains.model.Ticket;
import com.javabrains.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {

    TicketRepository ticketRepository;

    ShowService showService;

    ShowSeatsRepository showSeatsRepository;

    UserService userService;

    public GetTicketResponse createBooking(CreateBookingRequest createBookingRequest){

        User user = userService.getUserByName(createBookingRequest.getUserName());
        System.out.println(user);
        Show show = showService.getShowById(createBookingRequest.getShowId());
        List<ShowSeats> showSeats = showSeatsRepository.findShowSeatStatusByShowIdAndShowSeatIds(createBookingRequest.getShowId(),
                createBookingRequest.getShowSeatList());
      long count = showSeats.stream().
              filter((e->!(e.getShowSeatsStatus().equals(ShowSeatsStatus.AVAILABLE)))).count();
        if(count>0){
            throw new ShowSeatNotAvailableException("seat not available");
        }

        showSeats.stream().forEach(e->e.setShowSeatsStatus(ShowSeatsStatus.LOCKED));
        showSeatsRepository.saveAll(showSeats);
        Double amount = showSeats.size()*showSeats.get(0).getPrice();
       Ticket newTicket = Ticket.builder().showSeatsList(showSeats).show(show).
               ticketStatus(TicketStatus.PENDING).bookedAt(new Date()).user(user).amount(amount).build();
       Ticket savedTicket =  ticketRepository.save(newTicket);
        return new GetTicketResponse(savedTicket.getBookedAt(),savedTicket.getId(),savedTicket.getAmount(),savedTicket.getTicketStatus(),savedTicket.getUser());
    }



}
