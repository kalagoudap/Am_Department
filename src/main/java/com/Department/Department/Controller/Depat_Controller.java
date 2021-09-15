package com.Department.Department.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Department.Department.Department_service.Dept_servc;
import com.Department.Department.Entity.Department;

@RestController
public class Depat_Controller {

	@Autowired
	Dept_servc dept_servc;
	
	@GetMapping("/getdeptdetails/{id}")
	public Department getdepartmentdetailsc(@PathVariable Long id) {
		return dept_servc.getdepartmentdetails(id);
	}
	
	@PostMapping("/Savedeptdetails")
	public Department savedeptdetails(@RequestBody Department department) {
		return dept_servc.savedepartmentdetails(department);
	}
}
