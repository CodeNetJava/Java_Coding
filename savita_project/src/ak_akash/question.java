package ak_akash;
import java.util.Scanner;
public class question {
	
	public static void flipCoin(int n, String s) {
		
		char[] ch = new char [s.length()];
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			ch[i]= s.charAt(i);
		}
		
		for(int j = 0 ; j <= s.length()/2 ; j+=2) 
		{
			if(ch[j]==ch[j+1])
			{
				
				if(j==s.length()/2)
				{
					System.out.println("Yes");
				}
				else
				{
					continue;
				}
			}
			else
			{
				System.out.println("No");
				break;
			}
		}
		}

	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.nextLine();
		String str = s.nextLine();
		
		flipCoin(number,str);

	}

}
