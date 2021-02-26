package Lock.Wait_Notify;

public class Input implements Runnable {
    private Resource resource;
    public Input(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        int i=0;
        while (true){
            if (i%2==0){
                resource.set("ross","man");
            }else {
                resource.set("phonbe","girl");
            }
            i++;
        }
    }
}
