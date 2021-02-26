package ThreadSafe;

public class Test_ThreadSafe_question {
    public static void main(String[] args) {
        //这样是多个线程执行多个对象的任务
        ThreadSafe_Runnable r1 = new ThreadSafe_Runnable();
        ThreadSafe_Runnable r2 = new ThreadSafe_Runnable();
        ThreadSafe_Runnable r3 = new ThreadSafe_Runnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}
