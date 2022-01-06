package comparator;

public class Student {
	int rollNo;
	int marks;
	String name;
	
	public Student(int rollNo, int marks, String name) {
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

}
