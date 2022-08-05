package com.Tcs.Ems.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Tcs.Ems.Model.EmployeeEntity;

@RestController
public class EmployeeController {

	public ResponseEntity<EmployeeEntity> loginCheck(@PathVariable String name,@PathVariable String email){
		
		return null;
		
	}
}
