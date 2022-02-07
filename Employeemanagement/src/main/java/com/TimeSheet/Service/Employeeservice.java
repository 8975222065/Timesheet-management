package com.TimeSheet.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TimeSheet.Exception.UserException;
import com.TimeSheet.Model.Employee;
import com.TimeSheet.Repository.EmployeeRepository;





@Service
public class Employeeservice implements IEmployeeservice {
	@Autowired
	EmployeeRepository emprepo;

	public Employee addEmployee(Employee employee) {
		
		Employee emp = emprepo.save(employee);
	
		return emp;
	}

	@Override
	public Optional<Employee> fetchById(int id) {
		return emprepo.findById(id);

		
	}

	public List<Employee> findAllById() {
		// TODO Auto-generated method stub
		return emprepo.findAll();


	}
	
	  public List<Employee> findByemp_email(String emp_email){ List<Employee>
	  employee=emprepo.findByemp_email(emp_email); 
	  return employee;
	  
	 }
	 

	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		emprepo.delete(employee);
		
	}
	@Override
	public Employee authenticateCustomer(String username, String password) throws UserException {
		
		
		Employee emp= emprepo.findByEmailAndPassword(username, password);
	
		if(emp == null)
			throw new UserException("Invalid Username or password..");
		else
			return emp;
		
	}

	

	

	


}

