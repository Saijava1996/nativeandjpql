package com.info.inet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.inet.entity.Department;
import com.info.inet.services.DepartmentImp;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentImp departmentImp;

	@PostMapping("/save")
	public Department saveDept(@RequestBody Department department) {
		return departmentImp.save(department);

	}

	@GetMapping("/getall")
	public List<Department> getAllDepts() {
		return departmentImp.getAllDepts();
	}

	@GetMapping("/getalldeptusingjpql")
	public List<Department> getAllDeptsUsingJpql() {
		return departmentImp.getAllDeptsUsingJpql();

	}

	@GetMapping("/getdname/{dname}")
	public List<Department> getDeptByDnameUsingJpql(@PathVariable String dname) {
		return departmentImp.getDeptByDnameUsingJpql(dname);

	}
	@GetMapping("/getdnamedrole/{dname}/{drole}")
	public List<Department> getDeptByDnameAndDroleUsingJpql(@PathVariable String dname,@PathVariable String drole){
		return departmentImp.getDeptByDnameAndDroleUsingJpql(dname, drole);
		
	}
	@GetMapping("/getnative")
	public List<Department> getAllDeptUsingNativeQuery(){
		return departmentImp.getAllDeptUsingNativeQuery();
		
	}


}
