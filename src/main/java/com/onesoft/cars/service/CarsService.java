package com.onesoft.cars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.cars.dao.CarsDao;

import com.onesoft.cars.entity.Cars;


@Service
public class CarsService {
	@Autowired
	CarsDao carDao;
	public String addCars(Cars car) {
		return carDao.addCars(car);
		}
	public Cars getcars(int id) {
		return carDao.getcars(id);
	}
	public String updatecars(Cars id) {
		return carDao.updatecars(id);
	}
	public String deletecars(int id) {
		return carDao.deletecars(id);
	}
	
	public String addAllcars(List<Cars> car) {
		return carDao.addAllcars(car);
	}
	public List<Cars> getAllcars() {
		return carDao.getAllcars();
	}

	
		
		}
	


