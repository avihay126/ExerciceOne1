import javax.sound.sampled.ReverbType;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestToBiggest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert First number:");
        int a = scanner.nextInt();
        System.out.println("Insert Second number:");
        int b = scanner.nextInt();
        System.out.println("Insert Third number:");
        int c = scanner.nextInt();
        if (a <= b && a <= c) {
            System.out.print("(" + a + ",");
            if (b <= c) {
                System.out.print(b + "," + c + ")");
            } else System.out.print(c + "," + b + ")");

        } else if (b <= a && b <= c) {
            System.out.print("(" + b + ",");
            if (a <= c) {
                System.out.print(a + "," + c + ")");
            } else System.out.print(c + "," + a + ")");
        } else if (c <= a && c <= b) {
            System.out.print("(" + c + ",");
            if (a <= b) {
                System.out.print(a + "," + b + ")");
            } else System.out.print(b + "," + a + ")");
        }

    }
}
