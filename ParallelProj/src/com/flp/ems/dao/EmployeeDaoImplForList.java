package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;

public  class EmployeeDaoImplForList implements IemployeeDao {

	List<Employee> employees=new ArrayList<Employee>();
	List<Department> departments=new ArrayList<Department>();
	List<Project> projects=new ArrayList<Project>();
	List<Role> roles=new ArrayList<Role>();
	
/*	Set<Employee> employees1=new HashSet<Employee>();
	Set<Department> departments1=new HashSet<Department>();
	Set<Project> projects1=new HashSet<Project>();
	Set<Role> roles1=new HashSet<Role>();
*/	
	public void addEmployee(Employee emp){
		if(!employees.contains(emp))//for checking duplicity
       employees.add(emp);
	   departments.add(emp.getDepartment());
	   projects.add(emp.getProject());
	   roles.add(emp.getRole());
/*
	   employees1.add(emp);
	   departments1.add(emp.getDepartment());
	   projects1.add(emp.getProject());
	   roles1.add(emp.getRole());
	   
	   for(Employee e:employees1)
	   {
		   System.out.println("eetvgretvbt"+e);
	   }
*/	   
	   
	   System.out.println(emp);
	    }
	
	
	
	public boolean removeEmployee(String kinid, String empName, String mail) {
	
		for (Employee emp : employees) {
		       if (emp.getKinid().equals(kinid)){
		          employees.remove(emp);
		          return true;
		       }
		       else if(emp.getEmpname().equals(empName))
				{
		          employees.remove(emp);
			      return true;
			    }
				  
			   else if(emp.getMail().equals(mail))
			    {
				   employees.remove(emp);
			       return true;
			    }
		 }
		return false;
	}
		

public Employee searchEmployee(String kinid,String empName,String mail) {
	for(Employee e:employees)
	{
		 if(e.getEmpname().equals(empName))
		{
			System.out.println("Name found ");
		    return e;			
		}
		  
		 else if( e.getMail().equals(mail))
			{
			  	System.out.println("Mail found ");
				return e;
				
			}
		 else if( e.getKinid().equals(kinid))
			{
				System.out.println(" Kinid found");
				return e;
			}	
			
		 else if(e.getEmpname().equals(empName) && e.getMail().equals(mail) && e.getKinid().equals(kinid))
			{
				System.out.println("name,email id and kin id found");
				return e;
			}
		 else if(e.getEmpname().equals(empName) && e.getMail().equals(mail))
			{
				System.out.println("name,email id found");
			    return e;
			}
		 else if( e.getMail().equals(mail) && e.getKinid().equals(kinid))
			{
				System.out.println("email id and kin id found");
			    return e;
			}
		 else if(e.getEmpname().equals(empName)  && e.getKinid().equals(kinid))
			{
				System.out.println("match found for name and kin id provided");
			
			return e;
				
			}
		
	}
	
	return null;
}
	/*public Employee searchEmployee(int empId) 
	{
		 for(Employee emp : employees) {
		        if(emp.getEmpid() == empId)
		        {
		        	return emp;
		        }
		  }
		 return null;
	}
	*/
	public List<Employee> getAllEmployee() {
		if(employees.isEmpty())
			return null;
		return employees;
	}




	
	
	public void modifyEmployee(Map empModifiedDetails,Employee emp,int ch) {
	//Employee emp=searchEmployee(Kinid,empName,mail);
		
		//int index=employees.indexOf(emp);
		//removeEmployee(Kinid,empName,mail);
		switch(ch)
		{
		case 1:emp.setEmpname((String) empModifiedDetails.get("empName"));
				//employees.add(index,emp);
				break;
		case 2:emp.setMail((String) empModifiedDetails.get("email"));
				//employees.add(index,emp);
				break;
		case 3:emp.setPhno((String) empModifiedDetails.get("phno"));
		        //employees.add(index,emp);
		        break;
		case 4:emp.setAddress((String) empModifiedDetails.get("address"));
				//employees.add(index,emp);
				break;
		case 5:emp.setDob((String) empModifiedDetails.get("dob"));
				//employees.add(index,emp);
				break;
		case 6:emp.setDoj((String) empModifiedDetails.get("doj"));
				//employees.add(index,emp);
				break;
		

		
				
		}
	}



}

