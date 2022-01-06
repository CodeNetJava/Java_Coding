import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import java.util.List ;

public class MultipleAnyCollable2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService excutorService = Executors.newFixedThreadPool(1);
		
		List <CollableTasks> tasks = List.of(new CollableTasks("savu"),new CollableTasks("diu"),new CollableTasks("didi"),new CollableTasks("meawo"));
		String results = excutorService.invokeAny(tasks);
		
		System.out.println(results);
		

	}

}

class CollableTasks implements Callable<String> {
	String name;
	public CollableTasks(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hi "+ this.name;
	}

}
