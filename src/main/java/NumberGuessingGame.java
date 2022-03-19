import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randNumber = rand.nextInt(100) + 1;

        int tryCount = 0;
        while(true) {
            System.out.println("Enter your guess (1-100): ");

            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess == randNumber) {
                System.out.println("Correct, You win");
                System.out.println("It took you " + tryCount + " tries");
                break;
            } else if (randNumber > playerGuess) {
                System.out.println("Nope, the number is higher. Try again.");
            } else {
                System.out.println("Nope, the number is lower. Try again.");
            }
        }

    }
}
