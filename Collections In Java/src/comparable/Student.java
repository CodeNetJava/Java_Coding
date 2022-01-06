package comparable;

public class Student implements Comparable <Student> {
 
	int marks;
	String name;
	
	public Student(int marks , String name) {
		this.marks = marks;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" +marks+ ", name=" + name+"]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
}
