package synchronizationMethod;

// remove word sychronised and see the output to understand the use of synchronisation
class Table{  
	 void  printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
	   System.out.println(n*i);  
   }  
  
 }  
}  

class Thread1 extends Thread{
	Table t;
    public Thread1(Table t) {
		this.t = t;
	}
	
	@Override
	public void run() {
       t.printTable(1);
	}
	
}


class Thread2 extends Thread{
	Table t;
    public Thread2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
       t.printTable(100);
	}
	
}

public class TestSynchronization1 {

	public static void main(String[] args) {
		
		Table obj = new Table();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();

	}

}
