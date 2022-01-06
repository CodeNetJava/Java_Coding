package equalsAndHashcodeMethods;

//if you override equals() method then you have to override hashCode() method also
public class EqualsAndHashcodeMethods {

	public static void main(String[] args) {
		Students s1 = new Students(1);
		Students s2 = new Students(1);
		
		// if objects are equal equals() return true
		System.out.println(s1.equals(s2));

	}

}


class Students{
	
	int id ; 
	public Students(int id) {
		super();
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
