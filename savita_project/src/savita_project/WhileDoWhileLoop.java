package savita_project;

public class WhileDoWhileLoop {

	public static void main(String[] args) {
		int first = 0;
		int last = 60;
		int count = 0;
		while(first <= last)
		{

			first++;
			if(count >= 5) {
				break;
			}
			
			if(first % 2 == 0) {
			System.out.println(first);
			count ++;
			}
				
		}
		System.out.println("number of even numbers = " +count);

	}

}
