package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.Com_service;
import com.project.entity.Validations;
import com.project.repo.ValRepositiory;


@RestController
public class valController {
	
	@Autowired
	private Com_service com_service;
	
	@GetMapping
	public String home() {
		return "Welcome to the validation app!!!";
		
	}
	
	@PostMapping( path = "/add")
	public ResponseEntity<Validations>  Addvalues(@RequestBody Validations newval) throws Exception {
		
		
		 Validations val  = com_service.Add_values(newval);
		    if (val == null) {
		        throw new Exception();
		    } else {
		        return new ResponseEntity<>(val, HttpStatus.CREATED);
		    }
		
	}
}
