package constructorBank;

public class Account {
	

	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account(String number,double balance,String customerName,String customerEmailAddress, String customerPhoneNumber)
	{
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public void deposite(int depositAmmount) {
		this.balance += depositAmmount;
		System.out.println("Deposited ammount "+depositAmmount+" total balance available is "+this.balance);
	}
	
	public void withdrawal(int withdrawalAmmount) {
		if( this.balance -withdrawalAmmount < 0) {
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
