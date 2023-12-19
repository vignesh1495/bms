package com.javabrains.service;

import com.javabrains.Repository.HallRepository;
import com.javabrains.Repository.SeatRepository;
import com.javabrains.dtos.CreateHallRequest;
import com.javabrains.dtos.GetHallResponse;
import com.javabrains.model.Hall;
import com.javabrains.model.Seats;
import com.javabrains.model.Theatre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HallService {

        HallRepository hallRepository;

        SeatRepository seatRepository;

        TheatreService theatreService;
        public GetHallResponse createHall(CreateHallRequest createHallRequest){
                Theatre theatre = theatreService.getTheatre(createHallRequest.getTheatreName());
                Hall hall = createHallRequest.toHall();
                hall.setTheatre(theatre);
                Hall hallEntity = hallRepository.save(hall);
                List<Seats> seatsEntityList = new ArrayList<>();
                for(int i=0;i<createHallRequest.getSeatNumber();i++){
                        Seats newSeat = createHallRequest.createSeats(i);
                        newSeat.setHall(hallEntity);
                        Seats newSeatEntity = seatRepository.save(newSeat);
                        seatsEntityList.add(newSeatEntity);
                }
                hallEntity.setSeats(seatsEntityList);
                hallRepository.save(hallEntity);
                return new GetHallResponse(hallEntity.id,hallEntity.getTheatre(),hallEntity.getShows(),hallEntity.getSeats());
        }

    public Hall getHallById(Long hallId) {
              return  hallRepository.getById(hallId);
    }
}
