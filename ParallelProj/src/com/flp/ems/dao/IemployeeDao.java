package com.flp.ems.dao;

import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

    public void addEmployee(Employee employee);
    public List<Employee> getAllEmployee();
	public Employee searchEmployee(String kinid, String empName, String mail);
//	public void modifyEmployee(Map empModifiedDetails, int empId, int ch);
	public void modifyEmployee(Map empModifiedDetails, Employee emp, int ch);
	public boolean removeEmployee(String kinid, String empName, String mail);
	
}

