package oo.serializable;

import java.io.*;

public class Wolf implements Serializable {
    private String name;

    public Wolf(String name) {
        this.name = name;
        System.out.println("调用有参数的构造器");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() == Wolf.class) {
            Wolf target = (Wolf) obj;
            return target.name.equals(this.name);
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) throws Exception {
        Wolf w = new Wolf("灰太狼");
        System.out.println("wolf对象创建完成!");

        Wolf w2 = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        // 创建对象输出流
        oos = new ObjectOutputStream(
                new FileOutputStream("a.bin")
        );
        // 创建对象输入流
        ois = new ObjectInputStream(
                new FileInputStream("a.bin")
        );
        // 序列化输出Java对象
        oos.writeObject(w);
        oos.flush();
        // 反序列化恢复Java对象
        w2 = (Wolf) ois.readObject();
        // 两个对象的实例变量值完全相等
        System.out.println(w.equals(w2));
        // 连个变量指向的对象是不一样的
        System.out.println(w == w2);

        oos.close();
        ois.close();
    }
}
