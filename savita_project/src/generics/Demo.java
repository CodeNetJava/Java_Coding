package generics;
import java.util.ArrayList;
public class Demo {

	public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(1);
	a.add(2);
	a.add("sau");
	a.add(4);
	a.add(5);
	
	for(int i = 0 ; i < a.size() ; i++)
	{
		System.out.println(a.get(i));
	}
	
	}

}
// here type safety is not there in integer list someone add string by mistake the it will not show error 
// type safety can be achieved by using generic