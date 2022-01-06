
 class UnCheckedException {
	 
	 public static void validate(int age) {  
	        if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  

	public static void main(String[] args) {
		 //calling the function 
		try{
			 validate(13);  
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
        System.out.println("rest of the code...");    

	}
   
 }
