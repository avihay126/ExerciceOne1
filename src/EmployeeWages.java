import java.util.Scanner;

public class EmployeeWages {
    public static int wage(int typeOfWorker, int monthlyHours, int dayToGoal) {
        int base;
        int bonus;
        int wage = 0;
        if (typeOfWorker == 0) {
            base = monthlyHours * 50;
            bonus = dayToGoal * 250;
            wage = base + bonus;
        } else if (typeOfWorker == 1) {
            base = monthlyHours * 200;
            bonus = dayToGoal * 250;
            wage = base + bonus;
        }
        return wage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            System.out.println("Select the type of worker");
            int typeOfWorker = scanner.nextInt();
            if (typeOfWorker != 0 && typeOfWorker != 1) {
                System.out.println("Invalid type");
            } else {
                System.out.println("Insert monthly work hours");
                int monthlyHours = scanner.nextInt();
                System.out.println("Insert days of meeting the goal");
                int dayToGoal = scanner.nextInt();
                int wageWorker = wage(typeOfWorker, monthlyHours, dayToGoal);
                System.out.println("Your wage is: " + wageWorker);
                System.out.println("0 to end, other number to continue");
                int stop = scanner.nextInt();
                if (stop == 0) {
                    i++;
                }
            System.out.println("GoodBye!");
            }
        }
    }
}