package thread;

public class RunnableA implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableA running");
    }

    public static void main(String[] args) {
        new Thread(new RunnableA()).start();
        System.out.println("main running");
    }
}
