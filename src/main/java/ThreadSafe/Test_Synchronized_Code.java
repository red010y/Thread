package ThreadSafe;

public class Test_Synchronized_Code {
    public static void main(String[] args) {
        Synchronized_Code runnable = new Synchronized_Code();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
