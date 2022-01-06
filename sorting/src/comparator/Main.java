package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
	 List<Student> list = new ArrayList<Student>();
		list.add(new Student(10,50,"bbb"));
		list.add(new Student(5,60,"aaa"));
		list.add(new Student(11,30,"vvv"));
		
		Collections.sort(list,new NameComparator());
		list.forEach(System.out::println);
		System.out.println("*****************************");
		
		Collections.sort(list, new rollNoComparator());
		list.forEach(System.out::println);
		System.out.println("*****************************");
		
		Collections.sort(list, new marksComparator());
		list.forEach(System.out::println);
		System.out.println("*****************************");

	}

}

class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class rollNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollNo - o2.rollNo;
	}
	
}

class marksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks - o2.marks;
	}
	
}
