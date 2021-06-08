package com.info.inet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.info.inet.entity.Department;

public interface DeptRepository extends JpaRepository<Department, Integer> {
	@Query("select d from Department d")
	public List<Department> findAllDeptsUsingJpql();

	@Query("select d from Department d where d.dname=:d")
	public List<Department> findDeptByDnameUsingJpql(@Param("d") String dname);

	@Query("select d from Department d where d.dname=:d and  d.drole=:r")
	public List<Department> findDeptByDnameAndDroleUsingJpql(@Param("d") String dname, @Param("r") String drole);

	@Query(value ="select * from dept", nativeQuery = true)
	public List<Department> findAllDeptUsingNativeQuery();

	

}