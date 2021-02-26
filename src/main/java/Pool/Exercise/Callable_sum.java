package Pool.Exercise;

import java.util.concurrent.Callable;

/**
 * 要求：通过线程池中的线程对象，使用Callable接口完成两个数求和操作
 */
public class Callable_sum implements Callable<Integer> {
    int i,j;
    public Callable_sum(int i,int j){
        this.i=i;
        this.j=j;
    }
    @Override
    public Integer call() throws Exception {
        return i+j;
    }
}
