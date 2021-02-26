package Create;

public class Test_ExtendsThread_run {
    public static void main(String[] args) {
        ExtendsThread t1 = new ExtendsThread();
        ExtendsThread t2 = new ExtendsThread();
        t1.run();
        t2.run();
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}
