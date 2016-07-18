package com.flp.ems.view;

import java.util.*;

import com.flp.ems.domain.Employee;

public class BootClass {

	
		
		static UserInteraction ui=new UserInteraction();
		
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
		while(true){
	    System.out.println("Menu Selection\n1.Add Employee\n2.Modify Employee\n3.Remove Employee\n4.Search Employee\n5.Get Employee Details");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		menuSelection(ch);
		     }
		}
		public static void menuSelection(int ch){
			
			Employee emp;
			List<Employee> emps;
			
			switch(ch){
				case 1: ui.addEmployee();
						break;
			    case 2: ui.modifyEmployee();
				        break;
				case 3:ui.removeEmployee();
          				break;
				case 4:emp=ui.searchEmployee();
				        if(emp != null)
				       	System.out.println("Employee Found "+emp);
				        else
					    System.out.println("Employee Not Found");
				        break;
				case 5:emps=ui.getAllEmployee();
				        if(emps != null)
					    System.out.println("All Employees details are "+emps);
				        else
				      	System.out.println("No Employees Found");
				        break;
				case 6:System.exit(0);
				
			          }
		  }
		
}
