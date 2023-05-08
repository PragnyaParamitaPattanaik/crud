package com.example.EmployeeController;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Service.EmployeeServiceImpl;
import com.example.model.Employee;
@RestController
@RequestMapping("/api/v1")
public class Controller {
	@Autowired
    EmployeeServiceImpl empServiceImpl;
  
    @PostMapping("/")
    public void add() {
        empServiceImpl.addEmployee();
    }
  
    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
        return empServiceImpl.findAllEmployee();
    }
  
    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }
  
    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteAllData();
    }

	
}
	


