package listInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList1 = new LinkedList();
		
		linkedList1.add(00);
		linkedList1.add(1, 10);
		linkedList1.add(20);
	
		//addAll(int index, Collection<E> c)
		List<Integer> arrayList1 = new ArrayList();
		arrayList1.add(30);
		arrayList1.add(40);
		
		linkedList1.addAll(3, arrayList1);

		//addAll(Collection<E> c)
		linkedList1.addAll(List.of(50,60,70));
		linkedList1.addAll(new ArrayList(List.of(80,90)));
		
		//addFirst(E e)
		linkedList1.addFirst(0000);
		
		//addLast(E e)
		linkedList1.addLast(9999);
		
		System.out.println(linkedList1);
		
		System.out.println(linkedList1.get(7));
		System.out.println(linkedList1.getFirst());
		System.out.println(linkedList1.getLast());
		
		//remove(Object o)
		//linkedList1.remove(60); // give error
		//remove(int index)
		linkedList1.remove(6);
		System.out.println(linkedList1);

}}
