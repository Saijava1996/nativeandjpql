package com.info.inet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Department {
	@Id
	@GeneratedValue

	private int depid;
	private String dname;
	private String drole;
	private Double salary;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int depid, String dname, String drole, Double salary) {
		super();
		this.depid = depid;
		this.dname = dname;
		this.drole = drole;
		this.salary = salary;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDrole() {
		return drole;
	}

	public void setDrole(String drole) {
		this.drole = drole;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
