
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean isCorrect = false;

        System.out.print("Guess the number between 1 and 100: ");
        int userGuess = scanner.nextInt();

    }
}