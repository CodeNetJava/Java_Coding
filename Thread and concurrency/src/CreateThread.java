// two methods to create tread
// 1)extends Thread
// 2)implements Runnable
public class CreateThread {
	
	
	public static void main(String[] args) throws InterruptedException {
        System.out.println("task1 kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1); //lower priority//at last done
		task1.start();
		

		System.out.println("task2 kicked off");
		Task2 task2 =new Task2();
		//after creating runnable interface 
		//we have to create a thread class
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10); // highest priority//at first done
		task2Thread.start();
		
		// join() method means wait for task1 and task2 to complete before next statements
		task1.join();
		task2Thread.join();
		
		System.out.println("task3 kicked off");
		for(int i = 21;i<=30;i++) {
			System.out.print(i+" ");
	    }
		System.out.println("\ntask3 done");
		
		System.out.println("main done");
	}
	

}
class Task1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("\ntask1 started");
		for(int i = 0;i<=10;i++) {
			System.out.print(i+" ");
	}
		System.out.println("\ntask1 done");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("\ntask2 started");
		for(int i = 11;i<=20;i++) {
			System.out.print(i+" ");
	}
		System.out.println("\ntask2 done");
		
	}
	
}
