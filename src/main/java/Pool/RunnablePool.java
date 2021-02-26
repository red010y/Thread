package Pool;

public class RunnablePool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"...I want teacher");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Teacher is come in..."+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+"...Goodbye teahcer");
    }
}
