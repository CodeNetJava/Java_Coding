package object;

public class Main {

	public static void main(String[] args) {
		House address1 = new House("voilet");
		House address2 =  address1;
		
		System.out.println( address1.getColour());
		System.out.println( address2.getColour());
		
		House address3 = new House("marun");
		address2 = address3;
		
		System.out.println( address1.getColour());
		System.out.println( address2.getColour());
		System.out.println( address3.getColour());
		
		
	}
}

