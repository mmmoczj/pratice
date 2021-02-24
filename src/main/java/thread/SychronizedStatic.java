package thread;
// 静态同步方法---监视器为class
public class SychronizedStatic implements Runnable {

    static boolean staticFlag = true;

    public static synchronized void test0() {
        for (int i = 0; i < 100; i++) {
            System.out.println("test0: " + Thread.currentThread().getName() + " " + i);
        }
    }

    public void test1() {
        synchronized (this) { // 使用SynchronizedStatic.class和this的结果不一样,说明静态同步方法的监视器为Class
            for (int i = 0; i < 100; i++) {
                System.out.println("test1: " + Thread.currentThread().getName() + " " + i);
            }
        }
    }

    @Override
    public void run() {
        if (staticFlag) {
            staticFlag = false;
            test0();
        }else{
            staticFlag = true;
            test1();
        }
    }

    public static void main(String[] args) throws Exception{
        SychronizedStatic sychronizedStatic = new SychronizedStatic();
        new Thread(sychronizedStatic).start();
        //Thread.sleep(10);
        new Thread(sychronizedStatic).start();
    }
}
