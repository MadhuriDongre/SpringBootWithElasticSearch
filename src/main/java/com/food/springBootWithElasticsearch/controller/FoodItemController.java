package com.food.springBootWithElasticsearch.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.food.springBootWithElasticsearch.model.Fooditems;
import com.food.springBootWithElasticsearch.service.FoodItemService;

@RequestMapping("/foodItems/search")
@RestController
public class FoodItemController {
	@Autowired
	FoodItemService service;
	
	@RequestMapping(
			value = "/id/{id}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?> getFoodItem(@PathVariable String id) {
		Optional<Fooditems> foodItem = service.findOne(id);
		return new ResponseEntity<>(foodItem, HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/name/{name}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?> getFoodItemByName(@PathVariable String name) {
		List<Fooditems> foodItem = service.findByName(name);
		return new ResponseEntity<>(foodItem, HttpStatus.OK);
	}

	@RequestMapping(
			value = "/_search", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?> getAll() {
		Iterable<Fooditems> foodItem = service.findAll();
		return new ResponseEntity<>(foodItem, HttpStatus.OK);
	}

}
