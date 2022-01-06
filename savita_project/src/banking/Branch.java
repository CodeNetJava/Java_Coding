package banking;
import java.util.ArrayList;
public class Branch {
	private String name;
	private ArrayList <Customer> customer;
	
	public Branch(String name) {
		this.name = name;
		this.customer = new ArrayList <Customer>();
	}
	
	public boolean newCustomer (String name , double initialAmount) {
		if(find(name)==null) {
			this.customer.add(new Customer(name , initialAmount));
			return true;
		}
		else
		{
			
			return false;
		}
	}
	
	public boolean newTransaction (String name , double amount) {
		Customer s = find( name);
		if(s!=null) {
			 s.addTransaction(amount);
			 return true;
		}
		else
		{
			return false;
		}
	}
	
	private Customer find(String name) {
		for(int i = 0 ; i < customer.size() ; i++)
		{
			Customer newName = this.customer.get(i);
			if(name.equals(newName.getName())) {
				return newName;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}
	
}
