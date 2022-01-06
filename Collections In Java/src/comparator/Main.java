package comparator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 List<Student> a = List.of((new Student("savita",3,50)),(new Student("divya",2,30)),(new Student("priyanka",8,100)));
		 List<Student>  students = new ArrayList<>(a);
//		List<Student> students = new ArrayList<Student>();
//		students.add(new Student("savita",3,50));
//		students.add(new Student("divya",2,30));
//		students.add(new Student("priyanka",8,100));
		
		Collections.sort(students, new comparatorClassSortByName());
		students.forEach(System.out::println);  //this is lambda function
		System.out.println();
		
       Collections.sort(students, new comparatorClassSortByMarks());
       students.forEach(System.out::println); 
       System.out.println();
       
       Collections.sort(students, new comparatorClassSortByid());
       students.forEach(System.out::println); 
		
	}
}
	
	 class comparatorClassSortByName implements Comparator<Student>{
		
		@Override
		public int compare(Student o1 , Student o2) {
			
				return o1.name.compareTo(o2.name);
			}

       }
	 
	 class comparatorClassSortByMarks implements Comparator<Student>{
			
			@Override
			public int compare(Student o1 , Student o2) {
				
					return o1.marks-o2.marks;
				}

	       }
	 
	 class comparatorClassSortByid implements Comparator<Student>{
			
			@Override
			public int compare(Student o1 , Student o2) {
				
					return o1.id-o2.id;
				}

	       }
