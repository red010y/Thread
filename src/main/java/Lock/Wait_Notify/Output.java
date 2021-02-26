package Lock.Wait_Notify;

public class Output implements Runnable{
    private Resource resource;
    public Output(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        while (true){
            resource.get();
        }
    }
}
