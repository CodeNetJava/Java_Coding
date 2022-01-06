package readUserInput;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while(count < 6)
		{
			count++;
			System.out.println("enter name #"+count);
			int number = scanner.nextInt();
			scanner.nextLine();
		}
       scanner.close();
	}

}
