package book.crazy_java.oo.school;

import book.crazy_java.oo.serializable.Wolf;

public interface People {
    public void say();

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Wolf w1 = new Wolf("wolf1");
        Wolf w2 = new Wolf("wolf1");

        Object o = new Object();
        Object o2 = o;
        System.out.println(o==o2);
    }
}
