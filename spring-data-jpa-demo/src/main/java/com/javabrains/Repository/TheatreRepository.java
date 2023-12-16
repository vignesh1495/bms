package com.javabrains.Repository;

import com.javabrains.model.City;
import com.javabrains.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TheatreRepository extends JpaRepository<Theatre, Long> {

    Optional<Theatre> findByName(String name);

}

