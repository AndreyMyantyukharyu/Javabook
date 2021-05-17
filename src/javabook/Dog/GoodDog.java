package javabook.Dog;

public class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {

        if (size > 60) {
            System.out.println("Gaw Gaw");
        } else if (size > 14) {
            System.out.println("Woof woof");
        } else {
            System.out.println("Tyaw tyaw");
        }
    }
}

class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("First dog: " + one.getSize());
        System.out.println("Second dog: " + two.getSize());
        one.bark();
        two.bark();
    }
}
