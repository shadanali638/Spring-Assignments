package com.capg.beans;

import java.util.List;

public class EmployeeList extends Employee {
	List<Employee> empList;

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "EmployeeList [empList=" + empList + "]";
	}
	

}
