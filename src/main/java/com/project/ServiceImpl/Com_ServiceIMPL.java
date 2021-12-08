package com.project.ServiceImpl;



import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.Service.Com_service;
import com.project.entity.Validations;
import com.project.repo.ValRepositiory;

@Component
public class Com_ServiceIMPL implements Com_service {
	@Autowired
	private ValRepositiory val_repo;
   

	@Override
	public Validations Add_values(Validations val) {
		Validations savedval = val_repo.save(val);
		
		return val;
	}
	
}
