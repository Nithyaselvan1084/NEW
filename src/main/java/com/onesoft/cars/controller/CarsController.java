 package com.onesoft.cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.onesoft.cars.entity.Cars;
import com.onesoft.cars.service.CarsService;

@RestController
@RequestMapping(value = "/car")
public class CarsController {
	@Autowired
	CarsService carser;

	@PostMapping(value = "/add")
	public String addcar(@RequestBody Cars car) {
		return carser.addCars(car);
	}
	@GetMapping(value = "/get/{id}")
	public Cars getcar(int id) {
		return carser.getcars(id);
	}
	@PutMapping(value="/update/{id}")
	public String updatecar(@PathVariable Cars id) {
		return carser.updatecars(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deletecar(@PathVariable int id) {
		return carser.deletecars(id);
	}
	@PostMapping(value="/addAll")
	public String addAllcar(@RequestBody List<Cars> car) {
		return carser.addAllcars(car);
	}
	@GetMapping(value="/getAll")
	public List<Cars> getAllcar() {
		return carser.getAllcars();
	}


}
