package com.Tcs.Ems.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tcs.Ems.Model.EmployeeEntity;
import com.Tcs.Ems.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeEntity login(String name, String email) {
		EmployeeEntity log = employeeRepository.findByEmpNameAndEmpEmail(name, email);
		return log;
	}

	@Override
	public void delete(Integer eid) {
		employeeRepository.deleteById(eid);
	}

	@Override
	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	@Override
	public List<EmployeeEntity> ageLess(Integer age) {
		List<EmployeeEntity> less = employeeRepository.findByEmpAgeLessThan(age);
		return less;
	}

	@Override
	public void updateAll(List<EmployeeEntity> emp) {
		List<EmployeeEntity> saveAll = employeeRepository.saveAll(emp);
		
	}

	@Override
	public EmployeeEntity update(EmployeeEntity emp) {
		EmployeeEntity updateid= employeeRepository.save(emp);
		return updateid;
	}

	@Override
	public List<EmployeeEntity> getAllEmp() {
		List<EmployeeEntity> getall = employeeRepository.findAll();
		return  getall;
	}

	



}
