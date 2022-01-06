package bankingExercise;
import java.util.ArrayList;
public class Bank {
	private String name;
	private ArrayList <Branch> branches;
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList <Branch>();
	}
	
	public boolean addBranch(String name) {
//		Branch newBranch = findBranch(name);
		if( findBranch(name) == null) {
			this.branches.add(new Branch(name));
			return true;
		}
//		else
//		{
			return false;
//		}
	}
	
	public boolean addCustomer(String branchName , String customerName , double initialTransaction) {
		Branch existingBranch = findBranch(branchName);
		if( existingBranch != null) {
			return existingBranch.newCustomer(customerName, initialTransaction);
			//return true;
		}
		//else
		return false;
	}
	
	public boolean addCustomerTransaction (String branchName , String customerName , double transaction) {
		Branch existingBranch = findBranch(branchName);
		if( existingBranch != null) {
			return existingBranch.addCustomerTransaction(customerName, transaction);
			//return true;
		}
		//else
			return false;
	}
	
	private Branch findBranch (String name) {
		for(int i = 0 ; i < this.branches.size() ; i++)
		{
			Branch newBranch = this.branches.get(i);
			if(newBranch.getName().equals(name)) {
				return newBranch;
			}
		}
		return null;
	}
	
	public boolean listCustomers (String branchName , boolean printTransaction) {
		Branch branch = findBranch(branchName);
		if(branch!=null) {
		System.out.println("Customer details for branch "+branch.getName());
		ArrayList<Customer> branchCustomers  = branch.getCustomers();
		for(int i = 0 ; i < branchCustomers .size(); i ++) {
			Customer branchCustomer = branchCustomers .get(i);
			System.out.println("Customer: "+branchCustomer.getName()+"["+(i+1)+"]");
			
			if(printTransaction) {
				System.out.println("Transactions");
				ArrayList<Double> transactions = branchCustomer.getTransactions();
				for(int j = 0 ; j <transactions.size(); j++ ) {
					System.out.println("["+(j+1)+"]  Amount "+transactions.get(j));
				}
			}
			
		}
		return true;
		}
		else {
			return false;
		}
	}
}
//	public boolean listCustomers(String branchName, boolean showTransactions) {
//	       Branch branch = findBranch(branchName);
//	       if(branch != null) {
//	           System.out.println("Customer details for branch " + branch.getName());
//
//	           ArrayList<Customer> branchCustomers = branch.getCustomer();
//	           for(int i=0; i<branchCustomers.size(); i++) {
//	               Customer branchCustomer = branchCustomers.get(i);
//	               System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
//	               if(showTransactions) {
//	                   System.out.println("Transactions");
//	                   ArrayList<Double> transactions = branchCustomer.getTransactions();
//	                   for(int j=0; j<transactions.size(); j++) {
//	                       System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
//	                   }
//	               }
//	           }
//	           return true;
//	       } else {
//	           return false;
//	       }
//	   }
	
//}
 