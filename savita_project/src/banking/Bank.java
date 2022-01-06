package banking;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList <Branch> branch;
	public Bank(String name) {
		this.name = name;
		this.branch = new  ArrayList <Branch>();
	}
	
	private Branch find(String name) {
		for(int i = 0 ; i < branch.size() ; i++)
		{
			Branch newName = this.branch.get(i);
			if(name.equals(newName.getName())) {
				return newName;
			}
		}
		return null;
	}
	
	public boolean newBranch (String name ) {
		if(find(name)==null) {
			this.branch.add(new Branch(name));
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean addCustomer (String nameBranch ,String nameCustomer , double amountInitial) {
		Branch s = find( nameBranch);
		if(s!=null) {
			if(s.newCustomer(nameCustomer, amountInitial)) {
			 return true;
		}
			else
				return false;
		
	}
		else {
			return false;
		}
}
	
	public boolean addCustomerTransaction (String nameBranch ,String nameCustomer , double amount) {
		Branch s = find( nameBranch);
		if(s!=null) {
			if(s.newTransaction(nameCustomer, amount)) {
			 return true;
		}
			else
				return false;
		
	}
		else {
			return false;
		}
	}


	 public boolean listCustomers(String branchName, boolean showTransactions) {
		 Branch s = find( branchName);
			if(s!=null) {
				 System.out.println("Customer details for branch " + s.getName());
				 ArrayList <Customer> cList = s.getCustomer();
				 for(int i = 0 ; i < cList.size(); i++)
				 {
					 Customer cItem = cList.get(i);
					 System.out.println( cItem.getName());
					 
					 if(showTransactions) {
					 System.out.println("Transactions");
					 
					 ArrayList <Double> transactions = cItem.getTransactions();	 
					 for(int j = 0 ; j < transactions.size() ; j++) {
						 System.out.println( transactions.get(j));
					 }
				 }
				 }
				 return true;
			}
			return false;
	 }
//	public boolean listCustomers(String branchName, boolean showTransactions) {
//	       Branch branch = find(branchName);
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
//	}


}
