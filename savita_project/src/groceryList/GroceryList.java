package groceryList;

import java.util.ArrayList;

public class GroceryList {
 private ArrayList<String> groceryList = new ArrayList<String>();   //like creating object of class ArrayList of type String 
 
 public void addGroceryItem(String item)
 {
	 groceryList.add(item);
 }
 
 public ArrayList<String> getGroceryList(){
	 return groceryList;
 }
 
 public void printGroceryList() {
	 System.out.println("You have " + groceryList.size() + " items in your grocery list");
	 for(int i = 0 ; i<groceryList.size() ; i++ )
	 {
		 System.out.println((i+1)+ ". " +groceryList.get(i) );
	 }
 }
 public void modifyGroceryItem(String currentItem,String newItem) {
	 int position = groceryList.indexOf(currentItem);
	 if(position >= 0) {
		 modifyGroceryItem(position,newItem);
	 }
 }
 
 public void modifyGroceryItem(int position,String newItem) {
	 groceryList.set(position, newItem);
	 System.out.println("Grocery item " + (position+1) + " has been modified.");
 }
 
 public void removeGroceryItem(String item) {
	 int position = findItem(item);
	 if(position >= 0) {
         removeGroceryItem(position);
     }
 }
 
 public void removeGroceryItem(int position) { 
	 groceryList.remove(position);
 }
 
 public int findItem (String item) { 
	 return groceryList.indexOf(item);
 }
 
 public boolean onFile(String searchItem) {
	 int position = findItem(searchItem);
	 if(position >= 0) {
         return true;
     }
	 else {
		 return false;
	 }
 }
}
