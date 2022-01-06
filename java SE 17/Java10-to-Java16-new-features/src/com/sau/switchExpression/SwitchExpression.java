package com.sau.switchExpression;

public class SwitchExpression {

	public static void main(String[] args) {
		
		System.out.println(extracted1(1)); // by using switch case
		System.out.println(extracted2(3)); // by using switch expression

	}
	
	private static String extracted1(int day) throws IllegalArgumentException {
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
		
		return dayofTheWeek;
	}
	
	private static String extracted2(int day) throws IllegalArgumentException {
		
		 String str = switch(day){
		case 0 ->"monday";
		case 1 ->"tuesday";
		case 2 ->"wednesday";
		case 3 ->"friday";
		default -> throw new IllegalArgumentException("invalid input "+day);
		};
		
		return str;
	}

}
