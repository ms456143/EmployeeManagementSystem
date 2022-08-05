package com.Tcs.Ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tcs.Ems.Model.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	public EmployeeEntity findByEmpNameAndEmpEmail(String name,String email);
}
