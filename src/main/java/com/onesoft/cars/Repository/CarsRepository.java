package com.onesoft.cars.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.cars.entity.Cars;


public interface CarsRepository extends JpaRepository<Cars,Integer> {

}
