package com.onesoft.cars.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.cars.entity.Bikes;

public interface BikesRepository extends JpaRepository<Bikes,Integer> {

}
