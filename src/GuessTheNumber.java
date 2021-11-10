import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000) + 1;
        int guess;
        int numberOfGuesses = 0;
        String user = "User One";
        System.out.println("Number between 1-1000");
        do {
            System.out.println(user + ": select a number:");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            numberOfGuesses++;
            if (guess != number) {
                if (guess > number) {
                    System.out.println("The number is smallest than " + guess);
                } else if (guess < number) {
                    System.out.println("The number is bigger than " + guess);
                }
                if (user == "User One") {
                    user = "User Two";
                } else if (user == "User Two") {
                    user = "User One";
                }
            }
        } while (guess != number) ;
        System.out.println(user +" won! after "+ numberOfGuesses + " guesses");
    }
}
