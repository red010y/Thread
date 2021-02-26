package ThreadSafe;

public class Synchronized_Code implements Runnable{
    int trick=100;
    Object lock = new Object();
    @Override
    public void run() {
        while (trick > 0) {
            synchronized (lock) {
                if (trick > 0) {
                    try {
                        Thread.sleep(10);
                        System.out.println(Thread.currentThread().getName() + "剩余：" + --trick);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
