package Pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test_CallablePool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallablePool callable = new CallablePool();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        // 提交一个callable的任务用于执行，返回一个表示任务的未决结果的 Future。
        Future<String> future = pool.submit(callable);
        //获取线程执行结果
        String call_result = future.get();
        System.out.println(call_result);
    }
}
