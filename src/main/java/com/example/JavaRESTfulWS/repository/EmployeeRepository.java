package com.example.JavaRESTfulWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JavaRESTfulWS.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
