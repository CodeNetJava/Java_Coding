package abstractClass;

public class Main {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList(null);
		list.traverse(list.getRoot());
		String stringData = "1 2 3 4 5 6";
		//String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
		String[] data = stringData.split(" ");
		
		for(String s : data) {
			list.addItem(new Node(s));
		}
		
		//list.traverse(list.getRoot());
		
		 list.traverse(list.getRoot());
		 list.removeItem(new Node("3"));
	        list.traverse(list.getRoot());

	        list.removeItem(new Node("5"));
	        list.traverse(list.getRoot());

	        list.removeItem(new Node("0"));
	        list.removeItem(new Node("4"));
	        list.removeItem(new Node("2"));
	        list.traverse(list.getRoot());
	        
	        list.removeItem(new Node("1"));
	        list.removeItem(new Node("6"));
	        list.traverse(list.getRoot());
	}

}
