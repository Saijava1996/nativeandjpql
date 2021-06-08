package com.info.inet.services;

import java.util.List;

import com.info.inet.entity.Department;

public interface DeptInterface {
	public Department save(Department department);

	public List<Department> getAllDepts();

	public List<Department> getAllDeptsUsingJpql();

	public List<Department> getDeptByDnameUsingJpql(String dname);

	public List<Department> getDeptByDnameAndDroleUsingJpql(String dname, String drole);

	public List<Department> getAllDeptUsingNativeQuery();

}
