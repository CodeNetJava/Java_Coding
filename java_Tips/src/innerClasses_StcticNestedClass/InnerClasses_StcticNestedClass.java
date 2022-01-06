package innerClasses_StcticNestedClass;

public class InnerClasses_StcticNestedClass {
	int i = 0;
	
	// class A is a inner class
	class A{
		public void display() {
			i = 9; // inside non-static nested class can access instance variables of outer class
		}
	}
	
	// class B is a static nested class
	static class B {
         public void display() {
		//	i = 9;    // inside static  nested class can't access instance variables of outer class
		}
	}

	public static void main(String[] args) {
		//object created of inner class
		InnerClasses_StcticNestedClass obj = new InnerClasses_StcticNestedClass();
		A obj1 = obj.new A();
		
		//object created of static nested class
		B obj2 = new B();


	}

}
