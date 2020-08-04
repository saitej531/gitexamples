package multithread;

import java.util.concurrent.*;

public class ExecutorExample {
	// Managing thread xxx business operation + Thread pool---pool of threads

	// 3 tasks , 2 threads
	// /Different types of thread pools

	/// fixed thread pool
	// cached thread pool: threads grow as per the requirment
	/// single thread pool

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// ExecutorService executorService = Executors.newCachedThreadPool();
		/// ExecutorService executorService = Executors.newSingleThreadExecutor();

		Runnable task1 = new NumberRunnable("task 1");
		Runnable task2 = new NumberRunnable("task 2");
		Runnable task3 = new NumberRunnable("task 3");

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		executorService.shutdown();

	}

}
