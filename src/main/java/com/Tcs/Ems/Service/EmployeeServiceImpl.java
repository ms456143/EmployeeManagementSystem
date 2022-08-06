package com.Tcs.Ems.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.Tcs.Ems.Model.EmployeeEntity;
import com.Tcs.Ems.Repository.EmployeeRepository;

@Service
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
		List<EmployeeEntity> findByEmpAgeLessThan = employeeRepository.findByEmpAgeLessThan(age);
		return findByEmpAgeLessThan;
	}

	



}
