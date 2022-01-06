package generics;

public class Main {

	public static void main(String[] args) {
		Test<Integer> obj = new Test<Integer>(6);
		System.out.println(obj.getGoa());
		
		Test<String> obj1 = new Test<String>("sau");
		System.out.println(obj1.getGoa());
		
		Test<Double> obj2 = new Test<Double>(99.99);
		System.out.println(obj2.getGoa());
		

	}

}
