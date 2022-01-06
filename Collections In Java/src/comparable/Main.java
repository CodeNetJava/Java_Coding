package comparable;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Student> o1 = new ArrayList<>();
		o1.add(new Student(11,"asavita"));
		o1.add(new Student(12,"cdivya"));
		o1.add(new Student(8,"bpriyanka"));
		
		Collections.sort(o1);
		
	ListIterator<Student> i = o1.listIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
