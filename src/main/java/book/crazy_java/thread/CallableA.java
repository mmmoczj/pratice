package book.crazy_java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableA implements Callable {
    int i = 0;

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " i的值为:" + i);
        Thread.sleep(1000);
        return i++;
    }

    public static void main(String[] args) throws Exception {
        CallableA callableA = new CallableA();
        for (int i = 0; i < 10; i++) {
            FutureTask task = new FutureTask(callableA);
            new Thread(task, "子线程" + i).start();
            try {
                System.out.println("子线程返回值:" + task.get() + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(1);
    }
}
