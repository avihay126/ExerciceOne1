import java.util.Scanner;

public class Asterisks {
    public static int number (int number){
        Scanner scanner = new Scanner(System.in);
         while (number < 5 || number > 20){
             System.out.println(" insert number between 5-20!!");
             number = scanner.nextInt();
         }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" insert number between 5-20");
        int number = scanner.nextInt();
        int asterisk = number(number);
        asterisks(asterisk);
    }
    public static void asterisks(int asterisk){
         for (int i=0; i<asterisk;i++){
           for (int j=0; j<=i;j++){
               System.out.print("* ");
           }
             System.out.println("");
        }
    }
}
