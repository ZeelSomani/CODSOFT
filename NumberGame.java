import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Guess any number from a specified range of 1 to 100");

        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I have selected a number between " + minRange + " to " + maxRange + ". Guess what it is.");

            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            System.out.print("Do you want to try again? (yes/no): ");
            String playAgainChoice = scanner.next().toLowerCase();
            if (!playAgainChoice.equals("yes")) {
                playAgain = false;
            }
            attempts = 0;
        }

        System.out.println("Thanks for playing! Your total score is: " + score);
        scanner.close();
    }
}
