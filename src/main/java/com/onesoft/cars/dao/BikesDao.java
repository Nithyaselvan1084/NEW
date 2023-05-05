package com.onesoft.cars.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.cars.Repository.BikesRepository;

import com.onesoft.cars.entity.Bikes;

@Repository
public class BikesDao {
	@Autowired
	BikesRepository bikeRepo;

	public String addbikes(Bikes bike) {
		bikeRepo.save(bike);
		return "Sucess";
	}

	public Bikes getbikes(int id) {
		return bikeRepo.findById(id).get();
	}

	public String updatebikes(Bikes id) {
		bikeRepo.save(id);
		return "Successfully updated";
	}

	public String deletebikes(int id) {
		bikeRepo.deleteById(id);
		return "Successfully deleted";
	}

	public String addAllbikes(List<Bikes> bike) {
		bikeRepo.saveAll(bike);
		return "Successfully saved";
	}

	public List<Bikes> getAllbikes() {
		return bikeRepo.findAll();
	}

}
