import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! select day please ");
        int day = scanner.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("Invalid day");
        } else if (day == 6 || day == 7) {
            System.out.println("Our office is closed on weekends");
        } else {
            System.out.println("Earliest arrival time: ");
            int earliestTime = scanner.nextInt();
            if (earliestTime < 0 || earliestTime > 23) {
                System.out.println("Invalid time");
            } else {
                System.out.println("Latest arrival time: ");
                int latestTime = scanner.nextInt();
                if (latestTime < 0 || latestTime > 23) {
                    System.out.println("Invalid time");
                } else if (latestTime< earliestTime) {
                    System.out.println("Not possible");
                }else{
                        switch (day) {
                            case 1:
                            case 2:
                            case 4:
                            case 5:
                                if ((earliestTime < 9 || earliestTime > 17) || (latestTime < 9 || latestTime > 17)) {
                                    System.out.println("Office is close. open between 9-17");
                                }else {
                                    System.out.println("The request was accepted!");
                                }
                                break;
                            case 3:
                                if ((earliestTime < 8 || earliestTime > 12) || (latestTime < 8 || latestTime > 12)) {
                                    System.out.println("Office is close. open between 8-12");
                                } else {
                                    System.out.println("The request was accepted!");
                                }
                                break;
                        }
                    }
                }
            }
        }
    }
