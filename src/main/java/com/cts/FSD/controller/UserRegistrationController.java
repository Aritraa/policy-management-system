package com.cts.FSD.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.FSD.model.UserRegistrationModel;
import com.cts.FSD.repository.UserRegistrationRepository;

@RestController
@RequestMapping("/policy-management/users/registration")
public class UserRegistrationController {
	
	@Autowired
	public UserRegistrationRepository userRegistrationRepository;
	
	@GetMapping
	public List<UserRegistrationModel> register()
	{
		return userRegistrationRepository.findAll(); // to find all the data of user table
	}
	@PostMapping
	public void create(@RequestBody UserRegistrationModel userRegistrationModel)
	{
		userRegistrationRepository.save(userRegistrationModel); // to save all the data into database 
	}
	@GetMapping("/{id}")
	public UserRegistrationModel get(@PathVariable("id") long id)
	{
		return userRegistrationRepository.getOne(id);// to get one particular data based on id
	}

}
