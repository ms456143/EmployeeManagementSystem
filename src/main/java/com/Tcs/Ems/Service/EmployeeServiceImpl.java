package com.Tcs.Ems.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Tcs.Ems.Model.EmployeeEntity;
import com.Tcs.Ems.Repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeServiceI{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public EmployeeEntity login(String name, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeEntity addEmp(EmployeeEntity employeeEntity) {
		EmployeeEntity save = employeeRepository.save(employeeEntity);

		
		return save;
	}

	@Override
	public List<EmployeeEntity> addMultiEmp(List<EmployeeEntity> employeeEntities) {

		List<EmployeeEntity> saveAll = employeeRepository.saveAll(employeeEntities);
		
		return saveAll;
	}

	@Override
	public Optional<EmployeeEntity> getById(Integer id) {

	Optional<EmployeeEntity> findById = employeeRepository.findById(id);
		
	return findById;
	}

}
