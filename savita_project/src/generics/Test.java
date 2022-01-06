package generics;

public class Test<T> {
	public T goa; //member
	
	//constructor is like a method of same name as class name
	public Test( T goa){ 
		this.goa = goa;
	}
	
	public T getGoa() {
		return this.goa;
	}

}

