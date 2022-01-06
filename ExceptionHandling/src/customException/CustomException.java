package customException;
//user defined custom exception
public class CustomException {

		public static void main(String[] args) throws CreatedCustomException  {
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
		
		public void add(Amount that) throws CreatedCustomException{
			if(!(that.currency.equals(this.currency))) {
				throw new CreatedCustomException("currencies dont match");
			}
			
			
			this.amount = this.amount + that.amount;
		}
		
		@Override
		public String toString() {
			return currency+" "+amount;
		}
	}
	
	
	class CreatedCustomException extends Exception{
		public CreatedCustomException(String msg) {
			super(msg);
		}
	}

