import java.util.Scanner;

public class ArithmeticProgression {
    public static void  printSeries(int firstNumber, int difference, int amountOfNumbers) {
        int n = 0;
        while (n < amountOfNumbers){
            System.out.print(firstNumber+ " ");
            n++;
            firstNumber = firstNumber + difference;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Insert the difference:");
        int difference = scanner.nextInt();
        System.out.println("Select the amount of numbers:");
        int amountOfNumbers =scanner.nextInt();
        printSeries(firstNumber,difference,amountOfNumbers);
    }
}
