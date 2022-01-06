package constructorBank;

public class Account2 {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	
	public Account2()
	{
	    this("56789", 2.50, "Default name", "Default address", "default phone");   // at this line below parameter constructor gets called
        System.out.println("Empty constructor called");
	}
	public Account2(String number,double balance,String customerName,String customerEmailAddress, String customerPhoneNumber)
	{
		System.out.println("parameter constructor called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public Account2(String number, double balance, String customerName) {
		 this(number, balance, customerName,"divya@gmail.com","9075745109");
		 System.out.println("second parameter constructor called");
	}
	
	public void deposite(int depositAmmount) {
		this.balance += depositAmmount;
		System.out.println("Deposited ammount "+depositAmmount+" total balance available is "+this.balance);
	}
	
	public void withdrawal(int withdrawalAmmount) {
		if( this.balance -withdrawalAmmount < 0) 
		{
			System.out.println("insufficient balance to withdrawal");
		}
		else
		{
		this.balance -= withdrawalAmmount;
		System.out.println("withdrawal ammount "+withdrawalAmmount+" total balance available is "+this.balance);
		}
	}

	public String getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

}

