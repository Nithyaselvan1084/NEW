package com.onesoft.cars.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.cars.Repository.CarsRepository;

import com.onesoft.cars.entity.Cars;


@Repository
public class CarsDao {
	@Autowired
	CarsRepository carRepo;
	public String addCars(Cars car) {
		carRepo.save(car);
		return "Sucess";
	}
	public Cars getcars(int id) {
		return carRepo.findById(id).get();
	}

	public String updatecars(Cars id) {
		carRepo.save(id);
		return "Successfully updated";
	}

	public String deletecars(int id) {
		carRepo.deleteById(id);
		return "Successfully deleted";
	}

	public String addAllcars(List<Cars> bike) {
		carRepo.saveAll(bike);
		return "Successfully saved";
	}

	public List<Cars> getAllcars() {
		return carRepo.findAll();
	}


}
