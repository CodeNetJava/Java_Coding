package code3.singlyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	 Node head =null;
    public  void add() {
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
		int data;
		System.out.println("enter data");
		data = sc.nextInt();
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		
		System.out.println("do you want to add more press yes-1 / no-0");
		n = sc.nextInt();
		}while(n==1);
	}
    
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

	public static void main(String[] args) {
		SinglyLinkedList obj = new SinglyLinkedList();
		obj.add();
		obj.iterate();
		
	}	

}
