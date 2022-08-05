package com.Tcs.Ems.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tcs.Ems.Model.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	public EmployeeEntity findByEmpNameAndEmpEmail(String name,String email);
	
	public List<EmployeeEntity> findByEmpAgeLessThan(Integer age);
}
