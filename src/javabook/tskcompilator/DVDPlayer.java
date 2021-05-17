package javabook.tskcompilator;

public class DVDPlayer {

    boolean canRecord = false;

    void playDVD() {
        System.out.println("playDVD");
    }

    void recordDVD() {
        System.out.println("recordDVD");
    }

}

class DVDPlayerTestDrive {
    public static void main(String[] args) {

        DVDPlayer d = new DVDPlayer ();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
