package staticKeyword;

public class Main {

	public static void main(String[] args) {
		// for counter class 
		
		Counter.count1 = 0; // for static variable there is no need to create an object we can directly access it by class name
	  //Counter.count2 = 0;  //to access non static variable we need create object // cant accesss by class name show error
		Counter obj1 = new Counter();
		obj1.count2 = 0;   // both static and non static variables can be accessed by object of class
		obj1.count1 = 0;
		
		obj1.display();
		
		Counter obj2 = new Counter();
		obj2.display();
		
		Counter obj3 = new Counter();
		obj3.display();
		//*********************
		
		// for EmployeeOfSameCompany class
		EmployeeOfSameCompany emp1 = new EmployeeOfSameCompany("savita" , 100);
		emp1.display1();
		EmployeeOfSameCompany emp2 = new EmployeeOfSameCompany("sahitya" , 101);
		emp2.display1();
		EmployeeOfSameCompany emp3 = new EmployeeOfSameCompany("bhagi" , 102);
		emp3.display1();
		
		
		//************************
	}

}
