package thread;

// 静态代码块与线程join的关系
public class StaticCodeBlock {
    static String website = "www.google.com";
    static {
        Thread t = new Thread(() -> {
            System.out.println("进入run方法");
            System.out.println(website);
            website = "www.baidu.com";
            System.out.println("退出run方法");
        });
        t.start();
        /*try {
            t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    public static void main(String[] args) {
        System.out.println(StaticCodeBlock.website);
    }
}
