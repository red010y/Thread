package Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_RunnablePool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        RunnablePool runnable = new RunnablePool();
        //提交一个 Runnable 任务用于执行(调用run方法)
        pool.submit(runnable);
        pool.submit(runnable);
        pool.submit(runnable);

        //submit方法调用结束后，程序并不终止。
        //线程池控制了线程的关闭。将使用完的线程又归还到了线程池中
        //最后必须关闭线程池
        pool.shutdown();
    }
}
