package Create;

public class ExtendsThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<3;i++) {
            System.out.println(currentThread().getName()+"...run..."+i);
        }
    }
}
