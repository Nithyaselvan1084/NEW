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

import com.onesoft.cars.entity.Bikes;
import com.onesoft.cars.service.BikesService;




@RestController
@RequestMapping(value = "/bikes")
public class BikesController {
	@Autowired
	BikesService bikeser;

	@PostMapping(value = "/add")
	public String addbike(@RequestBody Bikes bike) {
		return bikeser.addbikes(bike);
	}
	@GetMapping(value = "/get/{id}")
	public Bikes getbike(int id) {
		return bikeser.getbikes(id);
	}
	@PutMapping(value="/update/{id}")
	public String updatebikes(@PathVariable Bikes id) {
		return bikeser.updatebikes(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deletebikes(@PathVariable int id) {
		return bikeser.deletebikes(id);
	}
	@PostMapping(value="/addAll")
	public String addAllbikes(@RequestBody List<Bikes> bike) {
		return bikeser.addAllbikes(bike);
	}
	@GetMapping(value="/getAll")
	public List<Bikes> getAllbikes() {
		return bikeser.getAllbikes();
	}



}
