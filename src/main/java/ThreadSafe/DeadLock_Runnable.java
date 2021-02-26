package ThreadSafe;

public class DeadLock_Runnable implements Runnable{
    Object A = new Object();
    Object B =new Object();
    int i=0;
    @Override
    public void run() {
        while (i!=10){
            if (i%2==0){
                synchronized (A){
                    System.out.println(Thread.currentThread().getName()+"--i%2==0--Lock--A");
                    synchronized (B){
                        System.out.println(Thread.currentThread().getName()+"--i%2==0--Lock--B");
                    }
                }
            }else {
                synchronized (B){
                    System.out.println(Thread.currentThread().getName()+"--i%2!=0--Lock--B");
                    synchronized (A){
                        System.out.println(Thread.currentThread().getName()+"--i%2!=0--Lock--A");
                    }
                }
            }
            i++;
        }
    }
}
