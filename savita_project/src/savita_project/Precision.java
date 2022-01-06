package savita_project;

public class Precision {

	public static void main(String[] args) {
		
		double a = 97 ;
		double b = 7;
		
		double c = a / b ;
		
		System.out.println(c);
		
		System.out.println(String.format("%.2f",c));
		System.out.println(String.format("%.3f",c));
		System.out.println(String.format("%.4f",c));

	}

}
