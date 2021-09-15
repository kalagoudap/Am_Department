package com.Department.Department.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Department.Department.Entity.Department;

@Repository
public interface Departmnt_repo extends JpaRepository<Department, Long>{

}
