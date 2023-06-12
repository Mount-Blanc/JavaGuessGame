
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean isCorrect = false;


        while (!isCorrect && attempts < 5) {
            System.out.print("Guess the number between 1 and 100: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                isCorrect = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            attempts++;
        }

        if (!isCorrect) {
            System.out.println("You have used up all your attempts. The number was: " + randomNumber);
        }

    }
}