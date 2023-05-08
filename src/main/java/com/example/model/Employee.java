package com.example.model;



import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	 public Employee(String string, String string2) {
		
	}
	@GeneratedValue(strategy = GenerationType.AUTO) 
	 @Id
	private long id;
	private String name;
	private String city;
	
	
}
