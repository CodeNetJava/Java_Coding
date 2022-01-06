package code4.singleLinkedList;

import java.util.Scanner;


public class AddAtLast {
    Node head = null;
    Scanner sc = new Scanner(System.in);
    int data,n;
   
	public static void main(String[] args) {
		AddAtLast obj = new AddAtLast();
		obj.add();
		obj.iterate();
		
	}
	
	public void add() {
		Node temp = head;
		do{
			data = sc.nextInt();
			Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}
		else {
			 temp = head;
			 while(temp.next!=null) {
				 temp = temp.next;
			 }
			 temp.next = newNode;
	        }
		 System.out.println("do you want to add more press yes-1 / no-0");
		 n = sc.nextInt();
		}while(n==1);}
	
	  public  void iterate() {
	    	Node temp = head;
	    	if(head == null) {
	    	System.out.println("empty list");
	    	}
	    	else {
	    		do{
	    			System.out.print(temp.data+" ");
			temp = temp.next;
			
	    	}while(temp!=null);
	    	}
		}


}
