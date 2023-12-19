package com.javabrains.model;

import com.javabrains.enums.TicketStatus;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tickets")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseModel {


    @ManyToOne
    private User user;

    @ManyToOne
    Show show;

    @ManyToMany
    List<ShowSeats> showSeatsList;

    private Double amount;

    private Date bookedAt;

    @Enumerated
    private TicketStatus ticketStatus;

    @OneToMany
    private List<Payment> payments;
}

