package oo.school;

public class Teacher implements People {

    public Teacher() {
    }

    @Override
    public void say() {
        System.out.println("teacher say...");
    }

    public static void main(String[] args) {
        Student p1 = new Student();
        Teacher p2 = new Teacher();
        String s = null;
        System.out.println(s instanceof String);
    }
}
