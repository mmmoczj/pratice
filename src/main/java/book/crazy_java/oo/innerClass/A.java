package book.crazy_java.oo.innerClass;

public class A {
    class In{
        public void test(){
            System.out.println("in 的test方法");
        }
    }
    class Ina extends In{

    }

    public static void main(String[] args) {
        new A();
    }
}
