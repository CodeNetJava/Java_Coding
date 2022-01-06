import java.util.concurrent.Executors;

public class ExecutorService {

	public static void main(String[] args) {
	//	java.util.concurrent.ExecutorService executorService = Executors.newSingleThreadExecutor();
		java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		
		executorService.shutdown();

	}

}

class Task extends Thread{
	int number;
	
	public Task(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		System.out.println("\ntask"+number+ "started");
		for(int i = number*10;i<=number*10+9;i++) {
			System.out.print(i+" ");
	}
		System.out.println("\ntask"+number+ "done");
	}
}
