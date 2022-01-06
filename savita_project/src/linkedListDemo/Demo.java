package linkedListDemo;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		LinkedList <String> placesToVisit = new LinkedList <String>();
//		placesToVisit.add("pattiwadgaon");
//		placesToVisit.add("ghatnandur");
//		placesToVisit.add("ambejogai");
//		placesToVisit.add("beed");
//		
//		printList(placesToVisit);
//		
//		placesToVisit.add(1, "pus");
//		printList(placesToVisit);
//		
		addInOrder(placesToVisit , "coco");
		addInOrder(placesToVisit , "digul");
		addInOrder(placesToVisit , "ambejogai");
		addInOrder(placesToVisit , "beed");
		
		printList(placesToVisit);
		visit(placesToVisit);
	}

	private static void printList(LinkedList <String> linkedList)  {
		Iterator <String> i = linkedList.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println("======================");
	}
	
	private static boolean addInOrder(LinkedList <String> linkedList , String cityName)
	{
		ListIterator <String> j = linkedList.listIterator();
		while(j.hasNext())
		{
			int value = j.next().compareTo(cityName);
			if(value == 0) {
				System.out.println(cityName+" is already present");
				return false;
			}
			else if(value > 0)
			{
				j.previous();
				j.add(cityName);
				return true;
			}
			else if(value < 0)
			{
				
			}
		}
		j.add(cityName);
		return false;
	}
	
	public static void visit(LinkedList<String> list)
	{
		Scanner s = new Scanner(System.in);
		boolean goingForward = true;
		boolean quit = false;
		ListIterator <String> i =  list.listIterator();
		
		if(list.isEmpty())
		{
			System.out.println("No cities in the itenerary");
			return;
		}
		else
		{
				System.out.println("Now visiting " + i.next());
	            printMenu();
		}
		
		while(!quit)
		{
			int number = s.nextInt();
			s.nextLine();
			switch(number) {
			case 0:
				System.out.println("Holiday (Vacation) over");
				quit = true;
				break;
			case 1:
				if(!goingForward) {
                    if(i.hasNext()) {
                        i.next();
                    }
                    goingForward = true;
                }
                if(i.hasNext()) {
                    System.out.println("Now visiting " + i.next());
                } else {
                    System.out.println("Reached the end of the list");
                    goingForward = false;
                }
                break;

            case 2:
                if(goingForward) {
                    if(i.hasPrevious()) {
                        i.previous();
                    }
                    goingForward = false;
                }
                if(i.hasPrevious()) {
                    System.out.println("Now visiting " + i.previous());
                } else {
                    System.out.println("We are at the start of the list");
                    goingForward = true;
                }
                break;

            case 3:
                printMenu();
                break;
			}
		}
	}
	private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

	
}
