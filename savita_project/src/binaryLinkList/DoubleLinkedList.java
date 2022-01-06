package binaryLinkList;

public class DoubleLinkedList {
	
	private NodeList head;
	private NodeList tail;
	private int length;
	
	
	
	public DoubleLinkedList() {
		this.head = null;
		 this.tail = null;
		 this.length = 0;
	}
	
	private class NodeList {

	// next which is pointing next node
	//previous which pointing previous node
		 NodeList next;
		 NodeList previous;
		 Object data;
	
	// constructor is created give value to the node
		public NodeList(Object data) {
			this.data = data;
		}	
}

	public boolean empty(){
		if(head == null)
		{
			return true;
		}
		return false;
	}
	
	public void insertforward(Object value)
	{
		NodeList newNode = new NodeList(value);
		if(empty()) {
			head = newNode;
		}
		
		else {

		}
		
	}
	
	public void insertbackward(Object value)
	{
		NodeList newNode = new NodeList(value);
		if(empty()) {
			tail = newNode ;
		}
		
		else {
			 head.next = newNode;
		}
		newNode.previous = head;
		head = newNode;
	}
	
	public void display() {
		if(head == null)
		{
			System.out.println("list is empty");
		}
		else {
			NodeList temp = head;
			do {
				System.out.println(temp.data);
				temp=temp.previous;
			}while(temp!=null);
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList o =new  DoubleLinkedList();
		DoubleLinkedList.NodeList m =o.new NodeList(0);
		o.insertforward('a');
		o.insertforward('b');
		o.insertforward('c');
		o.insertforward('d');
		
		o.display();
	}

}
