package com.howtodoinjava.demo.web;

import com.howtodoinjava.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

//TODO : this class is a rest controller
//TODO : this main home is "/"
public class EmployeeMvcController
{
	@Autowired
	EmployeeService service;

	//TODO : expose all employee in home "/"

	//TODO : to modify an employee use "/edit" and update by ID

	//TODO : to delete an employee use "/delete" and update by ID

	//TODO: to create an employee use "/createEmployee"


}
