package com.Tcs.Ems.Controller;

import java.util.List;

import java.util.Optional;

import javax.management.loading.PrivateClassLoader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.Tcs.Ems.Model.EmployeeEntity;

import com.Tcs.Ems.Service.EmployeeServiceImpl;
import com.Tcs.Ems.Service.EmployeeServiceI;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI employeeServiceI;

	@GetMapping(value="/login/{name}/{email}",consumes = "application/json",produces = "application/json")
	public ResponseEntity<EmployeeEntity> loginCheck(@PathVariable String name,@PathVariable String email){
		EmployeeEntity login = employeeServiceI.login(name, email);
		return new ResponseEntity<>(login,HttpStatus.OK);	
	}
	
	@GetMapping(value="/delete/{eid}",consumes = "application/json")
	private ResponseEntity<String> delete(@PathVariable Integer eid){
		employeeServiceI.delete(eid);
		String msg="Deleted Employee ID Successfully";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping(value="/deleteAll",produces = "application/json")
	private ResponseEntity<String> deleteAllEmp(){
		employeeServiceI.deleteAll();
		String msg="Deleted All Employee ID's Successfully";
		return new ResponseEntity<>(msg,HttpStatus.OK);	
	}
	
	@PostMapping(value="/ageLessThan/{age}",produces = "application/json")
	private ResponseEntity<List<EmployeeEntity>> getEmpByAgeLessThan(@PathVariable Integer age){
		List<EmployeeEntity> ageLess = employeeServiceI.ageLess(age);
		return new ResponseEntity<>(ageLess,HttpStatus.OK);
	}
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	
	@PostMapping(value = "/AddEmp",produces = "application/json", consumes = "application/json")
	public ResponseEntity<String> addemp(@RequestBody EmployeeEntity employeeEntity)
	{
		EmployeeEntity addEmp = employeeServiceImpl.addEmp(employeeEntity);
		
		Integer empId = addEmp.getEmpId();
		
		String msg="Employee Information Added Successfuly your id is  ="+empId;
		
		if(empId!= null)
		{
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
	
		String ms="No Emplyee Added ";
		
		return new ResponseEntity<String>(ms,HttpStatus.BAD_REQUEST);
		
	}
	
	@PostMapping(value = "/AddEmpMulti",produces = "application/json", consumes = "application/json")
	
	public ResponseEntity<List<EmployeeEntity>> addMullti(@RequestBody List<EmployeeEntity>  employeeEntity  )
	{
		
		List<EmployeeEntity> addmulti = employeeServiceImpl.addMultiEmp(employeeEntity);
		
		
		

		return new ResponseEntity<List<EmployeeEntity>>(addmulti,HttpStatus.CREATED);
		
	}
	
	public ResponseEntity<Optional<EmployeeEntity>> getbyid(@PathVariable Integer id)
	{
		
		Optional<EmployeeEntity> byId = employeeServiceImpl.getById(id);
		
		
		return new ResponseEntity<Optional<EmployeeEntity>>(byId,HttpStatus.OK);		
	}
	
	
	
	
	
	
}
