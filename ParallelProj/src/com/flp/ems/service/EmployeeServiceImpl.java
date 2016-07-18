package com.flp.ems.service;

import java.util.List;
import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public  class EmployeeServiceImpl implements IEmployeeService {
	
	IemployeeDao empDao;
	
	
	public EmployeeServiceImpl(){
		empDao=new EmployeeDaoImplForList();
				
	}
	
	public void addEmployee(Map empDetails){

		Employee employee=new Employee();
		Department department=new Department();
		Project project=new Project();
		Role role=new Role();

		employee.setEmpid((Integer) empDetails.get("empId"));
		employee.setKinid((String) empDetails.get("Kinid"));
		
		employee.setEmpname((String) empDetails.get("empName"));
		employee.setMail((String) empDetails.get("mail"));
		employee.setPhno((String)empDetails.get("phno"));
		employee.setAddress((String)empDetails.get("address"));
		employee.setDob((String)empDetails.get("dob"));
		employee.setDoj((String)empDetails.get("doj"));

		department.setDeptid((Integer) empDetails.get("deptId"));
		department.setDeptName((String) empDetails.get("deptName"));

		employee.setDepartment(department);

		project.setProjId((Integer) empDetails.get("projId"));
		project.setProjName((String) empDetails.get("projName"));
		project.setDepartment(department);

		employee.setProject(project);

		role.setRoleId((Integer) empDetails.get("roleId"));
		role.setRoleName((String) empDetails.get("roleName"));

		employee.setRole(role);

		empDao.addEmployee(employee);
		
	}

	public boolean removeEmployee(String kinid, String empName, String mail) {
		return empDao.removeEmployee(kinid,empName,mail);
	}

	
	public Employee searchEmployee(String kinid,String empName,String mail){
		
		return empDao.searchEmployee(kinid,empName,mail);
	}

	public List<Employee> getAllEmployee() {
		return empDao.getAllEmployee();
	}
	
	public void modifyEmployee(Map empModifiedDetails,Employee emp,int ch) {
		empDao.modifyEmployee(empModifiedDetails,emp,ch);
		
	}

}
