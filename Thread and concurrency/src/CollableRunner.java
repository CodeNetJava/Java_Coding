import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService excutorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = excutorService.submit(new CollableTask("savu"));
		String welcomeMsg = welcomeFuture.get();
		System.out.println(welcomeMsg);
 		
		System.out.print("\nmain method completed");
		excutorService.shutdown();
		

	}

}


class CollableTask implements Callable<String> {
	String name;
	public CollableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hi "+ this.name;
	}

}