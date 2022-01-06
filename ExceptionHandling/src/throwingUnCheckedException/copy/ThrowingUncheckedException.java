package throwingUnCheckedException.copy;

// for unchecked exception 
// it will not give error if exception is not thrown or not handled
public class ThrowingUncheckedException {

	public static void main(String[] args) {
		Amount amount1 = new Amount(10,"USD");
		Amount amount2 = new Amount(20,"GSD");
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
	
	public void add(Amount that) {
		if(!(that.currency.equals(this.currency))) {
			throw new RuntimeException("currencies dont match");
		}
		
		
		this.amount = this.amount + that.amount;
	}
	
	@Override
	public String toString() {
		return currency+" "+amount;
	}
}
