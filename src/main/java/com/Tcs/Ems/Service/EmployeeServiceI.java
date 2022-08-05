package com.Tcs.Ems.Service;

import java.util.List;

import com.Tcs.Ems.Model.EmployeeEntity;

public interface EmployeeServiceI {

	public EmployeeEntity login(String name,String email);
	
	public void delete(Integer eid);
	
	public void deleteAll();
	
	public List<EmployeeEntity> ageLess(Integer age);
}
