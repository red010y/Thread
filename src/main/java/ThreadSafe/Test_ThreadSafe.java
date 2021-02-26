package ThreadSafe;

public class Test_ThreadSafe {
    public static void main(String[] args) {
        //这样是多个线程执行1个对象的任务
        ThreadSafe_Runnable runnable = new ThreadSafe_Runnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
