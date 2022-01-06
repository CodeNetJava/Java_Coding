package throwingCheckedException;

// for checked exception 
// it will  give error if exception is not thrown or not handled
// you have to either throw or handle by try-catch

//note- if we thorws Exception it will not show error but further code after exception will not execute
//note- if we handle the error(using try-catch) the futher code after exception will gets execute 
public class ThrowingCheckedException {

	public static void main(String[] args) throws Exception  {
		Amount amount1 = new Amount(10,"USD");
		Amount amount2 = new Amount(20,"GSD");
		
		//Exception has handled
		/*
		try {
		amount1.add(amount2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(amount1);
		*/
		
		// Exception has thrown
		amount1.add(amount2);
		System.out.println(amount1);
	}

}

class Amount{

	int amount;
	String currency;
	
	public Amount(int amount,String currency) {
		this.amount =amount;
		this.currency = currency;
	}
	
	public void add(Amount that) throws Exception{
		if(!(that.currency.equals(this.currency))) {
			throw new Exception("currencies dont match");
		}
		
		
		this.amount = this.amount + that.amount;
	}
	
	@Override
	public String toString() {
		return currency+" "+amount;
	}
}
