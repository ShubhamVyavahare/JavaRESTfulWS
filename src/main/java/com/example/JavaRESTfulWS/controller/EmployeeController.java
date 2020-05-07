package com.example.JavaRESTfulWS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaRESTfulWS.model.Employee;
import com.example.JavaRESTfulWS.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/employees")
	public List<Employee> all() {
		return service.all();
	}

	@PostMapping("/employees")
	public Employee newEmployee(@RequestBody Employee newEmployee) {
		return service.newEmployee(newEmployee);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
	}

	@PutMapping("/employees/{id}")
	public Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

		return service.replaceEmployee(newEmployee, id);
	}
}
