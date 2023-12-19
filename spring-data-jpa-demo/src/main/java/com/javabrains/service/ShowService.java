package com.javabrains.service;

import com.javabrains.Exception.MovieNotFoundException;
import com.javabrains.Repository.SeatRepository;
import com.javabrains.Repository.ShowRepository;
import com.javabrains.Repository.ShowSeatsRepository;
import com.javabrains.dtos.CreateShowRequest;
import com.javabrains.dtos.GetShowResponse;
import com.javabrains.enums.ShowSeatsStatus;
import com.javabrains.model.Hall;
import com.javabrains.model.Movie;
import com.javabrains.model.Show;
import com.javabrains.model.ShowSeats;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ShowService {

        ShowRepository showRepository;

        ShowSeatsRepository showSeatsRepository;

        MovieService movieService;

        HallService hallService;



    public GetShowResponse createShow(CreateShowRequest createShowRequest) {


        Movie movie = movieService.getMovieByName(createShowRequest.getMovieName());
        Hall hall = hallService.getHallById(createShowRequest.getHallId());

        Show show= Show.builder().movie(movie).hall(hall).build();
        show = showRepository.save(show);
        List<ShowSeats> showSeatsList=new ArrayList<>();
        for(int i=0;i<hall.getSeats().size();i++){
            ShowSeats showSeats = ShowSeats.builder().seat(hall.getSeats().get(i)).showSeatsStatus(ShowSeatsStatus.AVAILABLE).price(200.00d).show(show).build();
            showSeatsList.add(showSeats);
            showSeatsRepository.save(showSeats);
        }
        show.setShowSeats(showSeatsList);
        showRepository.save(show);
        return new GetShowResponse(show.id,show.getHall().getTheatre().getName(),show.getHall().getTheatre().getCity());
    }

    public Show getShowById(Long showId) {
        Show show = showRepository.getReferenceById(showId);
        return  show;
    }
}
