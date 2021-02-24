package oo.innerClass;

public class Outer {
    private int num = 1;
    public void ss(){
        System.out.println("a");
    }
    private class Inner {
        private int num = 2;
        public void fun() {
            System.out.println(Outer.this.num);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        System.exit(0);
        System.out.println(inner.num);
        Outer a = new Outer(){
            public void ss(){
                System.out.println("aaa");
            }
        };
        a.ss();
    }
}
