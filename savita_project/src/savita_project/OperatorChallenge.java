package savita_project;

public class OperatorChallenge {

	public static void main(String[] args) {
	
		double s1 = 20;
		double s2 = 80;
		double t1 = (s1 + s2)*100;
		System.out.println(t1);
		double r1 = t1 % 40;
		System.out.println(r1);
		boolean q1 = r1 == 0 ? true : false ;
		System.out.println(q1);
		if(!q1)
			System.out.println("get some remainder");
		
		
	}

}
