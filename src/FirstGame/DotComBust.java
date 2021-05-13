package FirstGame;
import java.util.*;

public class DotComBust {

        private GameHelper helper = new GameHelper();
        private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
        private int numOfGuesses = 0;

        private void setUpGame() {

            DotCom one = new DotCom();
            one.setName("Pets.com");
            DotCom two = new DotCom();
            two.setName("eToys.com");
            DotCom three = new DotCom();
            three.setName("Go2.com");
            dotComsList.add(one);
            dotComsList.add(two);
            dotComsList.add(three);

            System.out.println("Your task is to sink 3 sites.");
            System.out.println("Pets.com, eToys.com, Go2.com.");
            System.out.println("Try to sink them in as few attempts as possible.");

            for (DotCom dotComToSet : dotComsList) {
                ArrayList<String> newLocation = helper.placeDotCom(3);
                dotComToSet.setLocationCells(newLocation);
            }
        }

        private void startPlaying() {
            while (!dotComsList.isEmpty()) {
                String userGuess = helper.getUserInput("Make a move...");
                checkUserGuess(userGuess);
            }
            finishGame();
        }

        private void checkUserGuess(String userGuess) {

            numOfGuesses++;
            String result = "Miss";

            for (DotCom dotComToTest : dotComsList) {
                result = dotComToTest.checkYourself(userGuess);
                if (result.equals("Hit")) {
                    break;
                }
                if (result.equals("Sink")) {
                    dotComsList.remove(dotComToTest);
                    break;
                }
            }
            System.out.println(result);
        }

        private void finishGame() {
            System.out.println("All sites drowned! Game over!");
            if (numOfGuesses <= 18) {
                System.out.println("It took " + numOfGuesses + " attempts");
                System.out.println("Kaikki hyvin!");
            } else {
                System.out.println("It took you quite a long time. " + numOfGuesses + " attempts");
                System.out.println("Sharks to dance around your investments");
            }
        }

        public static void main(String[] args) {
            DotComBust game = new DotComBust();
            game.setUpGame();
            game.startPlaying();
        }
    }

