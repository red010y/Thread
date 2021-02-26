package Lock;

public class Test_Lock_Sale_Trick {
    public static void main(String[] args) {
        Lock_Sale_Trick runnable = new Lock_Sale_Trick();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
