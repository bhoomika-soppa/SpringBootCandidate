package com.candidate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.candidate.model.Model;
import com.candidate.service.Service;



@RestController
public class Controller {
	@Autowired
	Service service;
	@GetMapping("/details")
	public List<Model> GetAllDetails(@PathVariable String name){
		return service.getDetailsByName(name);
		
	}
	@PostMapping("/details")
	public void AddDetails(@RequestBody Model model) {
		
	}
	@PutMapping("/details/{id}")
	public void UpdateDetails(@PathVariable int Id, @RequestBody Model model) {
		
	}
	@DeleteMapping("/details/{id}")
	public void DeleteDetails(@PathVariable int Id) {
		
	}
	
	}
	


