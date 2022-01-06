package comparable;

public class Student implements Comparable<Student>{
	int rollNo;
	int marks;
	String name;
	
	public Student(int rollNo, int marks, String name) {
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return this.marks - o.marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

}
