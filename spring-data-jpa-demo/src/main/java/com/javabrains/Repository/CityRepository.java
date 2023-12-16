package com.javabrains.Repository;

import com.javabrains.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City,Integer> {


    Optional<City> findByName(String name);
}
