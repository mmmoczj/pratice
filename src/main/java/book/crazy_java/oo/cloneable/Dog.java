package book.crazy_java.oo.cloneable;

import java.util.Objects;

public class Dog implements Cloneable {
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        System.out.println("调用有参数的构造器");
        this.name = name;
        this.weight = weight;
    }

    // 重写object的clone方法
    public Object clone() {
        Dog dog = null;
        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() == Dog.class) {
            Dog target = (Dog) obj;
            return target.name.equals(this.name)
                    && target.weight == this.weight;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("czj", 120);
        Dog dog2 = (Dog) dog.clone();
        System.out.println(dog == dog2);
        System.out.println(dog.equals(dog2));

        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());

    }
}















