package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(10,50,"bbb"));
		list.add(new Student(5,60,"aaa"));
		list.add(new Student(11,30,"vvv"));
		
		Collections.sort(list);
		
		ListIterator<Student> i = list.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
