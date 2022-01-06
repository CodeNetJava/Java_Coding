package staticKeyword;
//this program is to show the when objects are created every time new variable is created and new memory gers allocate 
//but for static same previous variable gets accessed and change value of the same variables
//by this program we can keep count of objects created
//sau baby don't gets confused the static is like constant here value is changing 
//value is incrementing beocoz same variable is coming in picture same variable we are getting for every object
//that is it static made that variable constant
//and for non static every time diff varible diff memory
//the purpose of static variable is memory saving only

public class Counter {
	 static int count1 = 0;
     int count2 = 0;
     
    void display () {
  	  count1++;
  	  count2++;
  	  
  	  System.out.println("count1 = "+count1+" count2 = "+count2);
    }
}
