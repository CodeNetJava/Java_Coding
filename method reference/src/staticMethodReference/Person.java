package staticMethodReference;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;}
	
	public String getName() {
		return name;}
	
	public Integer getAge() {
		return age;}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";}
	}
