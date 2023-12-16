package com.javabrains.Repository;

import com.javabrains.model.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seats,Long> {

}
