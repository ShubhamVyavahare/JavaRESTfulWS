package com.example.JavaRESTfulWS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaRESTfulWS.model.Employee;
import com.example.JavaRESTfulWS.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	// CRUD operations

	// create
	public Employee newEmployee(Employee newEmployee) {
		return repository.save(newEmployee);
	}

	// read
	public List<Employee> all() {
		return repository.findAll();
	}

	// update
	public Employee replaceEmployee(Employee newEmployee, Long id) {

		return repository.findById(id).map(employee -> {
			employee.setName(newEmployee.getName());
			employee.setRole(newEmployee.getRole());
			return repository.save(employee);
		}).orElseGet(() -> {
			newEmployee.setId(id);
			return repository.save(newEmployee);
		});
	}

	// delete
	public void deleteEmployee(Long id) {
		repository.deleteById(id);
	}
}
