package userInput;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter date of birth");
		boolean yes = scanner.hasNextInt();
		
		if(yes)
		{
		
		int date = scanner.nextInt();
		
		scanner.nextLine();
				
		System.out.println("enter name");
		String name = scanner.nextLine();
		
		if( date > 0 && date < 9999)
		{
		System.out.println( name +" your age is "+(2020 - date));
		}
		
		else
		{
			System.out.println("Invalid Date");
		}
		}
		else
		{
			System.out.println("Invalid Date");
		}
		
		scanner.close();
	}
}
