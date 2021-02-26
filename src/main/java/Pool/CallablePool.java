package Pool;

import java.util.concurrent.Callable;
//Callable<String>方法的结果类型
public class CallablePool implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName()+"...call()";
    }
}
