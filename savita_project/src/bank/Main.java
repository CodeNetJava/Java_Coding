package bank;

public class Main {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setBalance(100);
		obj.setCustomerEmailAddress("savita@gmail.com");
		obj.setCustomerName("savita");
		obj.setNumber("12345");
		obj.setCustomerPhoneNumber("9021007058");
		
		obj.deposite(100);
		obj.withdrawal(50);

	}

}
