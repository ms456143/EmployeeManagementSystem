package com.Tcs.Ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tcs.Ems.Model.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
