package com.flp.ems.view;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction {
	
	 Validate val=new Validate();
	Scanner sc=new Scanner(System.in);
	IEmployeeService empService;

	Map<String, Object> empDetails=new HashMap<String, Object>();

		public UserInteraction(){
		 empService=new EmployeeServiceImpl();
	}
	
	public void addEmployee(){
		
	
		
		System.out.println("Enter empid");
		empDetails.put("empId", sc.nextInt());
		
		System.out.println("Enter Kin-id");
		empDetails.put("Kinid", sc.next());
		
		boolean z;
		do{
			System.out.print("Enter empName");
		    String na=sc.next();
		     z=val.isNameValid(na);
		    
		    if(z){
		    	
		    	System.out.println("Validated");
		    	empDetails.put("empName",na);

		    	
		    }
		    else{
		    	System.out.println("Invalid");
		    }
		    
			}while(z==false);

		
	/*	System.out.println("Enter empname");
		empDetails.put("empName", sc.next());
		*/boolean m;
		do{
			System.out.print("Enter mail");
		    String ma=sc.next();
		     m=val.isEmailValid(ma);
		    
		    if(m){
		    	
		    	System.out.println("Validated");
		    	empDetails.put("mail",ma);

		    	
		    }
		    else{
		    	System.out.println("Invalid");
		    }
		    
			}while(m==false);

		
		
		System.out.println("enter phone");
		empDetails.put("phno", sc.next());
		
		boolean p;
		do{
			System.out.print("Enter phone");
		    String ph=sc.next();
		     p=val.isPhoneNumberValid(ph);
		    
		    if(p){
		    	
		    	System.out.println("Validated");
		    	empDetails.put("phno",ph);

		    	
		    }
		    else{
		    	System.out.println("Invalid");
		    }
		    
			}while(p==false);

		
		
		
		
		System.out.println("enter address");
		empDetails.put("address", sc.next());
		
		boolean db,dj;
			
		do{
		System.out.print("Enter dob");
	    String dob=sc.next();
	    db=val.validate(dob);
	    
	    if(db){
	    	
	    	System.out.println("Validated");
	    	empDetails.put("dob",dob );

	    	
	    }
	    else{
	    	System.out.println("Invalid");
	    }
	    
		}while(db==false);
		
		do{
	    System.out.print("Enter employee DOJ");
		String doj=sc.next();
		  dj=val.validate(doj);
				    
		    if(dj){
		    	System.out.println("Validated");
		    	empDetails.put("doj", doj);
		    }
		    else{
		    	System.out.println("Invalid");
		    }
			

		}while(dj==false);
	  	
	 
		/*System.out.println("enter dob");
		empDetails.put("dob", sc.next());
		boolean db= val.validate("dob");
	
		System.out.println("enter doj");
		empDetails.put("doj", sc.next());
		boolean dj= val.validate("doj");
	   
       if(db==dj){
    	   System.out.println("Validated");
       }
	
       else
       {
    	   System.out.println("Invalid date \n input the correct date");
    	   //addEmployee();
    	   
       }*/
		
        System.out.println("enter dept id");
		empDetails.put("deptId", sc.nextInt());
		
		System.out.println("enter dept name");
		empDetails.put("deptName", sc.next());

		System.out.println("enter proj id");
		empDetails.put("projId", sc.nextInt());
		
		System.out.println("enter proj name");
		empDetails.put("projName", sc.next());

		
		System.out.println("enter role id");
		empDetails.put("roleId", sc.nextInt());
		
		System.out.println("enter role name");
		empDetails.put("roleName", sc.next());

		empService.addEmployee(empDetails);
	
		
      
	}
   

	public boolean removeEmployee()
	{
		//System.out.println("Enter emp id");
		String kinid;
		String empName,mail;
		while(true){
			System.out.println("1.Remove by id");
			System.out.println("2.Remove by name");
			System.out.println("3.Remove by mail");
			System.out.println("Enter ur choice:"); 	
			int c=sc.nextInt();
			if(c==4){
				break;
			}
		/*kinid=sc.next();
		empName=sc.next();
		mail=sc.next();*/
		switch(c){
		case 1:System.out.println("enter the kinid"); 
	    	   kinid=sc.next();
	    	   return empService.removeEmployee(kinid,"*","*");
	    case 2:System.out.println("enter the name"); 
               empName=sc.next();
               return empService.removeEmployee("*",empName,"*"); 
        case 3:System.out.println("enter the mail"); 
			   mail=sc.next();
			   return empService.removeEmployee("*","*",mail);
    
		}
		
	}

		//return empService.removeEmployee(Kinid,empName,mail;);
		return false;
	}
	
    public Employee searchEmployee()
	{
	String kinid;
	String empName,mail;
		while(true){
		System.out.println("1.Search by id");
		System.out.println("2.Search by name");
		System.out.println("3.Search by mail");
		System.out.println("4.Search by id and name");
		System.out.println("5.Search by id and mail");
		System.out.println("6.Search by mail and name");
		System.out.println("7.Search by id and name");
		System.out.println("8.Search by id,name,mail");
		System.out.println("Enter ur choice:"); 	
		int c=sc.nextInt();
		if(c==10){
			break;
		}
		switch(c){
			case 1:System.out.println("enter the kinid"); 
		    	   kinid=sc.next();
		    	   return empService.searchEmployee(kinid,"*","*");
		    case 2:System.out.println("enter the name"); 
                   empName=sc.next();
                   return empService.searchEmployee("*",empName,"*"); 
	        case 3:System.out.println("enter the mail"); 
				   mail=sc.next();
				   return empService.searchEmployee("*","*",mail);
	        case 4:System.out.println("enter the id and name");
				   kinid=sc.next();	
				   empName=sc.next();
			       return empService.searchEmployee(kinid,empName,"*");
	        case 5:System.out.println("enter the id and mail"); 
			       kinid=sc.next();	
			       mail=sc.next();
	               return empService.searchEmployee(kinid,"*",mail);
            case 6:System.out.println("enter the mail and name"); 
			       mail=sc.next();
			       empName=sc.next();
			       return empService.searchEmployee("*",empName,mail);
	        case 7:System.out.println("enter the id and name"); 
			       kinid=sc.next();	
			       empName=sc.next();
	               return empService.searchEmployee(kinid,empName,"*");
            case 8:System.out.println("enter the id,name,mail"); 
	               kinid=sc.next();	
			       empName=sc.next();
			       mail=sc.next();
			       return empService.searchEmployee(kinid,empName,mail);
   }
		}
	
		return null;
	}
	
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}
	
    public Employee modifyEmployee()
	{   
    	Employee emp=null;
    	String Kinid,empName,mail; 	
    	System.out.println("How you want to modfiy");
	    
	    while(true){
	    System.out.println("1.Modify by Name");	
	    System.out.println("2.Modify by mail");
	    System.out.println("3.Modify by Kinid");
	    int c=sc.nextInt();
		if(c==4){
			break;
		}
		switch(c){
		case 1:System.out.println("1.Name u want to modify");	
	           empName=sc.next();
	           emp=empService.searchEmployee("*", empName,"*" );
	           break;
		case 2:System.out.println("2.Mail u want to modify");	
  			   mail=sc.next();
    	       emp=empService.searchEmployee("*", "*", mail);
    	       break;
		case 3:System.out.println("3. u want to modify");	
			   Kinid=sc.next();
		       emp=empService.searchEmployee(Kinid,"*", "*");
		       break;
		}
	
	  if(emp!=null)
		{ 
			while(true)
			{ 
				Map<String,Object> empModifiedDetails=new HashMap<String,Object>();
					System.out.println("Modify Employee by:");
					System.out.println("1.Modify Name:");
					System.out.println("2.Modify  Email:");
					System.out.println("3.Modify  phno:");
					System.out.println("4.Modify  Address:");
					System.out.println("5.Modify  Dob:");
					System.out.println("6.Modify Doj:");
					
					System.out.println("Enter ur choice:"); 	
					int ch=sc.nextInt();
					if(ch==7){
						break;
					}
					switch(ch)
					{
						case 1:
							System.out.println("Enter The name");
							empModifiedDetails.put("empName", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 2:
							System.out.println("Enter The email");
							empModifiedDetails.put("mail", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 3:
							System.out.println("Enter The phno");
							empModifiedDetails.put("phno", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;	
						case 4:
							System.out.println("Enter The Address");
							empModifiedDetails.put("address", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 5:
							System.out.println("Enter The Dob");
							empModifiedDetails.put("dob", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 6:
							System.out.println("Enter The Doj");
							empModifiedDetails.put("dojs", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;	
					   		
					}
			}
			
		}
		
		
		
	
			   
   }
		return null;
	    
	}
}



