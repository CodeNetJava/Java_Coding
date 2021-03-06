package simpleCalculator;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;
	
	public double getFirstNumber()
	{
		return this.firstNumber;
	}
	
	public double getSecondNumber()
	{
		return this.secondNumber;
	}
	
	public void setFirstNumber(double firstNumber)
	{
		this.firstNumber = firstNumber ;
	}
	
	public void setSecondNumber(double secondNumber)
	{
		this.secondNumber = secondNumber ;
	}
	
	public double getAdditionResult()
	{
		setFirstNumber(firstNumber);
		setSecondNumber( secondNumber);
		
		return (getFirstNumber() + getSecondNumber());
	}
	
	public double getSubtractionResult()
	{
		setFirstNumber(firstNumber);
		setSecondNumber( secondNumber);
	
		return (getFirstNumber() - getSecondNumber());
	}
	
	public double getMultiplicationResult()
	{
		setFirstNumber(firstNumber);
		setSecondNumber( secondNumber);
	
		return (getFirstNumber() * getSecondNumber());
	}
	
	public double getDivisionResult()
	{
		if( getSecondNumber() == 0 )
		{
			return 0;
		}
		else
		{
		setFirstNumber(firstNumber);
		setSecondNumber( secondNumber);
		}
		return (getFirstNumber() / getSecondNumber());
	}

}
