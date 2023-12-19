package com.javabrains.dtos;

import com.javabrains.enums.TicketStatus;
import com.javabrains.model.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetTicketResponse {

    Date bookedAt; Long id;



    Double amount;   TicketStatus ticketStatus;  User user;


}
