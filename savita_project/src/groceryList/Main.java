package groceryList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	private static GroceryList groceryList = new GroceryList();
	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Enter your choice: ");
			int choice = s.nextInt();
			s.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
                break;
			case 1:
				groceryList.printGroceryList();
                break;
			case 2:
				addItem();
                break;
			case 3:
				modifyItem();
                break;
			case 4:
				removeItem();
                break; 
			case 5:
				searchForItem();
                break;
			case 6:
				processArrayList();
                break;
			case 7:
				 quit = true;
                break; 
			}
		}

	}
	
	public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
	
	public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(s.nextLine());
    }
	
	public static void modifyItem() {
		System.out.print("old item name: ");
		String olditem = s.nextLine();
		System.out.print("new item name: ");
		String newitem = s.nextLine();
        groceryList.modifyGroceryItem(olditem, newitem);
	}
	
	public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = s.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
	
	public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = s.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }
	
	public static void processArrayList() {
		ArrayList<String> newArrayList = new ArrayList<String>();
		newArrayList.addAll(groceryList.getGroceryList());
		
		ArrayList<String> newArrayList1 = new ArrayList<String>(groceryList.getGroceryList());
		
		String[] array1 = new String [groceryList.getGroceryList().size()];
		array1 = groceryList.getGroceryList().toArray(array1);
	}
}
