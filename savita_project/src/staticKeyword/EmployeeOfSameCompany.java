package staticKeyword;
 
public class EmployeeOfSameCompany {
     
	// without static
	//there are 1000 of employees in same company every time for comapny name new memory gets used when new object is created
	//but company name is same for 1000 employees
	//**********************
	//	String empName;
	//	String companyName;
	//	int empID;
	//	
	//	public EmployeeOfSameCompany(String empName, String companyName, int empID) {
	//		this.empName = empName;
	//		this.companyName = companyName;
	//		this.empID = empID;
	//	}
	
	//	 void display1 () {
	//	  	  System.out.println("empName = "+empName+" companyName = "+companyName+" empID = "+empID);
	//	    }
	//***********************
	
	
	// without static
	//**********************
			String empName;
			static String companyName = "fuckin TCS";
			int empID;
			
			public EmployeeOfSameCompany(String empName,  int empID) {
				this.empName = empName;
				this.empID = empID;
			}
		
			 void display1 () {
			  	  System.out.println("empName = "+empName+" companyName = "+companyName+" empID = "+empID);
			    }
	//***********************
}
