package Pool.Exercise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test_sum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Callable_sum callable = new Callable_sum(1, 2);
        Future<Integer> future = pool.submit(callable);
        Integer resut = future.get();
        System.out.println(resut);
    }
}
