import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number:");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("|" + number + "|=" + number);
        } else System.out.println("|" + number + "|=" + -number);
    }
}
