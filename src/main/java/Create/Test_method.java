package Create;

public class Test_method {
    public static void main(String[] args) {
        ExtendsThread t1 = new ExtendsThread();
        ExtendsThread t2 = new ExtendsThread();
        t1.start();//开启一个新线程，新线程调用run方法
        t2.run();//没有开启新线程, 在主线程调用run方法
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}
