package com.example.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	ArrayList<Employee> findAllEmployee();
}
