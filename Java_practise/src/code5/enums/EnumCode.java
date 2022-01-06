package code5.enums;

public class EnumCode {
	
	enum  Days{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATERDAY};

	public static void main(String[] args) {
	    System.out.println(Days.valueOf("SUNDAY")); // give SUNDAY
	    System.out.println(Days.valueOf("WEDNESDAY").ordinal());//give index 
	    
	    for (Days d : Days.values()) {
	    	System.out.print(d+" ");
	    }}}
