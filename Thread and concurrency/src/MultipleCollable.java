import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import java.util.List ;

public class MultipleCollable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService excutorService = Executors.newFixedThreadPool(1);
		List <CollableTask1> tasks = List.of(new CollableTask1("savu"),new CollableTask1("diu"),new CollableTask1("didi"),new CollableTask1("meawo"));
		
		List<Future<String>> results = excutorService.invokeAll(tasks);
		
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
		excutorService.shutdown();

	}

}

class CollableTask1 implements Callable<String> {
	String name;
	public CollableTask1(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hi "+ this.name;
	}

}
