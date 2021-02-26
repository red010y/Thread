package ThreadSafe;

public class Synchronized_Method implements Runnable{
    int trick=1000;
    @Override
    public void run() {
        while (trick>0){
            sale();
        }
    }

    private synchronized void sale() {
        if (trick>0){
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName() + "剩余：" + --trick);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
