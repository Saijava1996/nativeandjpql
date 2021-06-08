package com.info.inet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.inet.entity.Department;
import com.info.inet.repository.DeptRepository;

@Service
public class DepartmentImp implements DeptInterface {
	@Autowired
	private DeptRepository deptRepository;

	@Override
	public Department save(Department department) {

		return deptRepository.save(department);
	}

	@Override
	public List<Department> getAllDepts() {
		// TODO Auto-generated method stub
		return deptRepository.findAll();
	}

	@Override
	public List<Department> getAllDeptsUsingJpql() {
		// TODO Auto-generated method stub
		return deptRepository.findAllDeptsUsingJpql();
	}

	@Override
	public List<Department> getDeptByDnameUsingJpql(String dname) {
		// TODO Auto-generated method stub
		return deptRepository.findDeptByDnameUsingJpql(dname);
	}

	@Override
	public List<Department> getDeptByDnameAndDroleUsingJpql(String dname, String drole) {

		return deptRepository.findDeptByDnameAndDroleUsingJpql(dname, drole);
	}

	@Override
	public List<Department> getAllDeptUsingNativeQuery() {
		// TODO Auto-generated method stub
		return deptRepository.findAllDeptUsingNativeQuery();
	}

}
