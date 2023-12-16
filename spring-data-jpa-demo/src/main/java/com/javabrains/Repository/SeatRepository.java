package com.javabrains.Repository;

import com.javabrains.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Hall,Long> {

}
