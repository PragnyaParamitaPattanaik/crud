package com.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeService {
	ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
	}