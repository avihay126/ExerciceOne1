import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose first number:");
        int num1 = scanner.nextInt();
        System.out.println("Chose second number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        if (sum % 2 == 0) {
            System.out.println(" The sum is even: " + sum);
        } else System.out.println(" The sum is odd: " + sum);
    }
}
