package com.snort;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.snort.entity.Employee;
import com.snort.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeInformationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeInformationApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		List<Employee> list = new ArrayList<>();
		list = employeeRepository.findByFirstname("anil");
		System.out.println("by firstname : "+list);
		list = employeeRepository.findByEmail("anil@gmail.com");
		System.out.println("by email : "+list);
		list = employeeRepository.findByPhone("87954676");
		System.out.println("by phone : "+list);
		
	}

}
