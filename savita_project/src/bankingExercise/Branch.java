package bankingExercise;
import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList <Customer> customers;
	
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList <Customer> ();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	private Customer findCustomer (String name) {
		
		for ( int i = 0 ; i < this.customers.size() ; i++)
		{
			Customer newName = this.customers.get(i);
			if(newName.getName().equals(name))
			{
				return newName;
			}
		}
		
		return null;
	}
	
	public boolean newCustomer(String name , double initialTransaction) {
		if(findCustomer(name)==null) {
			this.customers.add(new  Customer(name , initialTransaction ));
			return true;
		}
		//else
			return false;
	}
	
	public boolean addCustomerTransaction(String name , double transaction) {
		Customer newTransaction = findCustomer(name);
		if(newTransaction!=null) {
			newTransaction.addTransaction(transaction);
			return true;
		}
		//else
			return false;
	}
	
}
