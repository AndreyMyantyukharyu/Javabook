package javabook.TestArrays;

public class TestArrays {
    public static void main(String[] args) {
        String [] islands = new String[4];
        islands[0] = "Bermudas";
        islands[1] = "Fiji";
        islands[2] = "Azoras islands";
        islands[3] = "Cosumuel";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            System.out.print("islands = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
