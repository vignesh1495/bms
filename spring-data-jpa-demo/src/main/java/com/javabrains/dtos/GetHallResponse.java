package com.javabrains.dtos;

import com.javabrains.model.Seats;
import com.javabrains.model.Show;
import com.javabrains.model.Theatre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetHallResponse {


    private long id;
    private Theatre theatre;
    private List<Show> shows;
    private List<Seats>seats;

}
