package com.sau.switchExpression;

public class SwitchExpression {

	public static void main(String[] args) {
		
		var day  = 0;
		extracted1(day);

	}

	private static void extracted1(int day) throws IllegalArgumentException {
		var dayofTheWeek = "";
		
		switch(day)
		{
		case 0: 
			dayofTheWeek = "monday";
			break;
		case  1: 
			dayofTheWeek = "tuesday";
			break;
		case 2: 
			dayofTheWeek = "wednesday";
			break;
		case 3 : 
			dayofTheWeek = "thursday";
			break;
		case 4 : 
			dayofTheWeek = "friday";
			break;
		default : throw new IllegalArgumentException("invalid input "+day);
		}
	}
	


}
