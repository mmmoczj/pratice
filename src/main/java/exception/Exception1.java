package exception;

public class Exception1 {
    public static int test(){
        int count = 5;
        try {
            throw new RuntimeException("测试异常");
        } finally {
            System.out.println("finally被执行");
            return count;
        }
    }
    public static void main(String[] args) {
        int a = test();
        System.out.println(a); // 5
    }
}
