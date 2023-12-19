package com.javabrains.Repository;

import com.javabrains.enums.ShowSeatsStatus;
import com.javabrains.model.Show;
import com.javabrains.model.ShowSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import  java.lang.Long;


public interface ShowSeatsRepository extends JpaRepository<ShowSeats,Long> {

    @Query("SELECT s FROM ShowSeats s "
            + "WHERE s.show.id = :showId AND s.id IN :showSeatIds")
    List<ShowSeats> findShowSeatStatusByShowIdAndShowSeatIds(
            @Param("showId") Long showId,
            @Param("showSeatIds") List<Long> showSeatIds);
}
