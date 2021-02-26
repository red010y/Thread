package ThreadSafe;

public class Test_Synchronized_Method {
    public static void main(String[] args) {
        Synchronized_Method runnable = new Synchronized_Method();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
