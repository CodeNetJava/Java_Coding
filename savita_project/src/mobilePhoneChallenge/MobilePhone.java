package mobilePhoneChallenge;
import java.util.ArrayList;
//import java.util.ArrayList;
public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		String name = contact.getName();
		if(findContact( name) == -1) {
			this.myContacts.add(contact);
			return true;
		}
		else
			return false;
		}
	
	public boolean updateContact(Contact oldcontact,Contact newcontact) {
		String name1 = oldcontact.getName();
		String name2 = newcontact.getName();
		int index = findContact(oldcontact);
		if(findContact( name1) == -1) {
			return false;}
		else if(findContact( name2) >= 0)
			{
			return false;
			}
		else
			this.myContacts.set(index, newcontact);
			return true;
	}
	
	public boolean removeContact(Contact contact) {
		int index = findContact(contact);
		if(index >= 0) {
			this.myContacts.remove(contact);
			return true;
		}
		else
			return false;
		}
	
	public Contact queryContact(String name) {
		if(findContact( name)== -1)
		{
			return null;
		}
		else {
			return this.myContacts.get(findContact( name));
		}
	}
	
	public void printContacts() {
		for(int i = 0 ; i < this.myContacts.size() ; i++) {
			System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
		}
	}
	
	private int findContact(String name) {
		for(int i = 0 ; i < this.myContacts.size() ; i++) {
			Contact scontact = this.myContacts.get(i);
			if(scontact.getName().equals(name)) {
				return i;
			}
				
		}
		return -1;
	}
	
	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}
}
