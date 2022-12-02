package com.javainuse.springvault.service;

import com.javainuse.springvault.model.Employee;
import com.javainuse.springvault.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

   @Autowired
   EmployeeRepository employeeRepository;


   public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
   }

}
