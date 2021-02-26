package ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_DeadLock_Runnable_Pool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        DeadLock_Runnable runnable = new DeadLock_Runnable();
        pool.submit(runnable);
        pool.submit(runnable);
        pool.submit(runnable);
        pool.shutdown();
    }
}
