package com.employee.demo.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.model.employee;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/employee/v1")

class employeeTestController{
	
	
	
	public List<employee> getAllList(){
		
		List<employee> emp = new ArrayList<employee>();
		
		employee E1 = new employee("Arya" , 1 , "PA");
		
		employee E2 = new employee("Priyanka", 2 , "Manager");
		emp.add(E1);
		emp.add(E2);
		
		
		return emp;
	}
	
	
}


