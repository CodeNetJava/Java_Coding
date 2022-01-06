package person;

public class Main {

	public static void main(String[] args) {
		Person obj1 = new Person();
		obj1.setFirstName( "savita" );
		obj1.setLastName( "shinde" );
		obj1.setAge( 23 );
		System.out.println("age = " + obj1.getAge());
		System.out.println("name = " + obj1.getFullName());
		
	}

}
