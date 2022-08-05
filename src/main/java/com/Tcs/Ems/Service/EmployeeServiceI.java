package com.Tcs.Ems.Service;

import java.util.List;
import java.util.Optional;

import com.Tcs.Ems.Model.EmployeeEntity;

public interface EmployeeServiceI {

	public EmployeeEntity login(String name,String email);

	public EmployeeEntity addEmp(EmployeeEntity employeeEntity);
	
	public List<EmployeeEntity> addMultiEmp(List<EmployeeEntity> employeeEntities);
	
	public Optional<EmployeeEntity> getById(Integer id);
	

	public void delete(Integer eid);
	
	public void deleteAll();
	
	public List<EmployeeEntity> ageLess(Integer age);
	
	

	
	public void updateAll (List<EmployeeEntity>emp);
	
	
	public EmployeeEntity update (EmployeeEntity emp);
	
	public List <EmployeeEntity>getAllEmp();

	
	



}
