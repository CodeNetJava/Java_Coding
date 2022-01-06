package constructorBank;

public class Main {

	public static void main(String[] args) {
		
//		Account objx = new Account("12345",200.0,"savita","savita@gmail.com","9021007058");
//		objx.deposite(100);
//		objx.withdrawal(50);
//		
//		Account2 objy = new Account2();   // constructor called inside the constructor
//		objy.deposite(100);
//		objy.withdrawal(50);
		
		Account2 s1 = new Account2();
		System.out.println(s1.getCustomerName());
		
		Account2 s2 = new Account2("12345",200.0,"savita","savita@gmail.com","9021007058");
		System.out.println(s2.getCustomerName());
		
		Account2 s3 = new Account2("12345",200.0,"divya");
		System.out.println(s3.getCustomerName());
	}

}
