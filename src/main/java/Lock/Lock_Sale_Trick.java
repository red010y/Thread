package Lock;

import java.util.concurrent.locks.ReentrantLock;

public class Lock_Sale_Trick implements Runnable{
    int trick=10000;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (trick > 0) {
            lock.lock();
            if (trick > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "。。。剩余：" + --trick);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.unlock();
        }
    }
}

