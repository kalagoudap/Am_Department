package com.Department.Department.Department_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Department.Department.Entity.Department;
import com.Department.Department.Repo.Departmnt_repo;

@Service
public class Dept_servc {
	
	@Autowired
	Departmnt_repo departmnt_repo;

	public Department getdepartmentdetails(long id) {
		return departmnt_repo.findById(id).get();
	}
	
	public Department savedepartmentdetails(Department department) {
		return departmnt_repo.save(department);
	}
}
