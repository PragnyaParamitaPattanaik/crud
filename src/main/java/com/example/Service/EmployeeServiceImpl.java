package com.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.EmployeeRepository;
import com.example.model.Employee;

import lombok.RequiredArgsConstructor;

@Service

public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public ArrayList<Employee>findAllEmployee(){
		return (ArrayList<Employee>)employeeRepository.findAll();
	}
	
	@Override
	public Employee findAllEmployeeByID(long id) {
	Optional<Employee>opt=employeeRepository.findById( id);
	if(opt.isPresent())
		return opt.get();
	else
		
		return null;
	}

	@Override
	public void addEmployee() {
		ArrayList<Employee>emp=new ArrayList<Employee>();
		emp.add(new Employee("Lucknow","Rita"));
		emp.add(new Employee("Delhi","Sita"));
		emp.add(new Employee("Ptna","Saim"));
		for(Employee employee: emp){
			employeeRepository.save(employee);
			
		}
	}

	
	@Override
	public void deleteAllData() {
		employeeRepository.deleteAll();
		
	}
	
	

	
	

}
