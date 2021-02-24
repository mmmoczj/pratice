package thread;

public class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("ThreadA running");
    }

    public static void main(String[] args) {
        new ThreadA().start();
        System.out.println("main线程");
    }
}
