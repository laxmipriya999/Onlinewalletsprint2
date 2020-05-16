package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Online;
import com.capg.service.OnlineService;

import com.capg.exceptions.IdNotFoundException;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OnlineController {

	@Autowired
	private OnlineService service;
	
	
	@GetMapping(path="/deposite/{accNo}&{depositeAmount}")
	public Online deposite(@PathVariable Long accNo,@PathVariable Double depositeAmount)
	{
		
		return service.deposite(accNo,depositeAmount);
	}
	

	@PutMapping("/Loginuser")
	public ResponseEntity<String> loginUser(@RequestBody Online u)
	{
		
		 boolean flag=service.loginUser(u);
		if(flag==false)
		{
			throw new IdNotFoundException("User not found");
		}
		else 
		{
			return new ResponseEntity<>("Login successful", new HttpHeaders(), HttpStatus.OK);
		}
	}
}




