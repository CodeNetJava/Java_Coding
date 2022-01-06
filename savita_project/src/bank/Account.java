package bank;

public class Account {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public void deposite(int depositAmmount) {
		this.balance += depositAmmount;
		System.out.println("Deposited ammount "+depositAmmount+" total balance available is "+this.balance);
	}
	
	public void withdrawal(int withdrawalAmmount) {
		this.balance -= withdrawalAmmount;
		System.out.println("withdrawal ammount "+withdrawalAmmount+" total balance available is "+this.balance);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}	
}
