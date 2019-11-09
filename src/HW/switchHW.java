package HW;
import java.util.Scanner;
public class switchHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number from 1 to 7? ");
        int weekday = sc.nextInt();
        switch (weekday){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fryday");
                break;
            case 6:
                System.out.println("Sataday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
