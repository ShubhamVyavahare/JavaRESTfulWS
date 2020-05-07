package com.example.JavaRESTfulWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JavaRESTfulWS.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
