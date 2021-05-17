package javabook.tskcompilator;

public class TapeDesk {

    boolean canRecord = false;

    void playTape() {
        System.out.println("play");
    }
    void recordTape() {
        System.out.println("record");
    }
}

class TapeDeskTestDrive {
    public static void main(String[] args) {

        TapeDesk t = new TapeDesk();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
