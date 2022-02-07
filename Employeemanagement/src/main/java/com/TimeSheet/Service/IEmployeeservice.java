package com.TimeSheet.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.TimeSheet.Exception.UserException;
import com.TimeSheet.Model.Employee;


@Service
public interface IEmployeeservice {
	public Employee addEmployee(Employee employee);
	public Optional<Employee> fetchById(int id);
	Employee authenticateCustomer(String username, String password) throws UserException;
	
}
