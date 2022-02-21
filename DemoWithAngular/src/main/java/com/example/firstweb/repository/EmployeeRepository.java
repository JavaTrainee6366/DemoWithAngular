package com.example.firstweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstweb.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
