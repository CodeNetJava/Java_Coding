package savita_project;

public class SwitchCase {

	public static void main(String[] args) {
		char ch = 'E';
		String s1 = "januAry";
		switch(ch) {
			case 'A' :
				System.out.println(" A is there ");
				break;
			case 'B' :
				System.out.println(" B is there ");
				break;
			case 'C' :
				System.out.println(" C is there ");
				break;
			case 'D' : case 'E' :
				System.out.println(" " + ch +" is there ");
				break;
			default :
				System.out.println(" Nothing found ");
				break;
		}
		
		switch(s1.toLowerCase()) {        //for upper case //s1.toUpperCase()
		case "january" :
			System.out.println(" january is there ");
			break;
		case "feb" :
			System.out.println(" feb is there ");
			break;
		case "march" :
			System.out.println(" march is there ");
			break;
		default :
			System.out.println(" Nothing found ");
			break;
	}
}
}
