package javabook.firstobject;

public class Andrey {
    String name;
    String slogan;
    int age;

    void sayIt() {
        System.out.println("I change the world");
    }

    public static void main(String[] args) {
        Andrey a = new Andrey();
        a.name = "Andrey";
        a.slogan = "I change the world";
        a.age = 34;
        a.sayIt();
    }
}
