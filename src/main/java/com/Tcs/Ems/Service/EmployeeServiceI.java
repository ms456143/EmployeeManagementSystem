package com.Tcs.Ems.Service;

import java.util.List;
import java.util.Optional;

import com.Tcs.Ems.Model.EmployeeEntity;

public interface EmployeeServiceI {

	public EmployeeEntity login(String name,String email);
	
	public EmployeeEntity addEmp(EmployeeEntity employeeEntity);
	
	public List<EmployeeEntity> addMultiEmp(List<EmployeeEntity> employeeEntities);
	
	public Optional<EmployeeEntity> getById(Integer id);
	
	
}
