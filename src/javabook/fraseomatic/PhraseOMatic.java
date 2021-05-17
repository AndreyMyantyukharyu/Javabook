package javabook.fraseomatic;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"round the clock", "three-star", "30,000 feet", "mutual", "win-win",
        "frontend", "web-based", "clever", "six sigma", "critical path method",
        "dynamic"};

        String[] wordlistTwo = {"authorized", "difficult", "pure product", "oriented", "central",
        "distributed", "branded", "network"};

        String[] wordListThree = { "process", "unloading point", "way out", "type of structures", "talent",
                "approach", "portal"};
        int oneLength = wordListOne.length;
        int twoLength = wordlistTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordlistTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("All we need is " + phrase);
    }
}
