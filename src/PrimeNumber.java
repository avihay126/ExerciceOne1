import java.util.Scanner;

public class PrimeNumber {
    public static int positiveNumber(){
        Scanner scanner= new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter positive number please: ");
            number = scanner.nextInt();
        }while (number<=0);
        return number;
    }

    public static void main(String[] args) {
        int positiveNumber =positiveNumber();
        for (int i = 1; i<=positiveNumber;i++){
            boolean result = primeNumber(i);
            if (result==false) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean moduleZero(int numerator,int denominator){
        boolean result;
        if (numerator%denominator==0){
            result = true;
        }else {
            result=false;
        }
        return result;
    }
    public static boolean primeNumber (int number ){
        boolean result=false;
        if (number==1){
            result=true;
        }else {

            for (int i = 2; i < number; i++) {
                result = moduleZero(number, i);
                if (result == true) {
                    i = number;
                }
            }
        }
       return result;
    }
}
