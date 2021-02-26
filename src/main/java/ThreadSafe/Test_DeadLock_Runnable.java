package ThreadSafe;

public class Test_DeadLock_Runnable {
    public static void main(String[] args) {
        DeadLock_Runnable runnable = new DeadLock_Runnable();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
