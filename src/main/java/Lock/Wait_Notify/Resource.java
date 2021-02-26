package Lock.Wait_Notify;

public class Resource {
    private String name;
    private String sex;
    private boolean flag;

    public synchronized void set(String name,String sex){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            this.name=name;
            this.sex=sex;
            flag=true;
            notify();
        }
    }

    public synchronized void get(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("姓名:"+name+",性别"+sex);
            flag=false;
            notify();
        }
    }
}
