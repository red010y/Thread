package ThreadSafe;

public class ThreadSafe_Runnable implements Runnable{
    int trick=3;
    @Override
    public void run() {
        while (trick>0){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"剩余："+--trick);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
