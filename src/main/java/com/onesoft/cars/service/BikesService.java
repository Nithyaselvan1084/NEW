package com.onesoft.cars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.cars.dao.BikesDao;
import com.onesoft.cars.entity.Bikes;


@Service
public class BikesService {
	@Autowired
	BikesDao bikeDao;

	public String addbikes(Bikes bike) {
		return bikeDao.addbikes(bike);
	}
	public Bikes getbikes(int id) {
		return bikeDao.getbikes(id);
	}
	public String updatebikes(Bikes id) {
		return bikeDao.updatebikes(id);
	}
	public String deletebikes(int id) {
		return bikeDao.deletebikes(id);
	}
	
	public String addAllbikes(List<Bikes> user) {
		return bikeDao.addAllbikes(user);
	}
	public List<Bikes> getAllbikes() {
		return bikeDao.getAllbikes();
	}

}
