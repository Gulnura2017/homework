package HW;
import java.util.Scanner;
public class positiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("Your number is positive.");
        }
        if (num < 0) {
            System.out.println("Your number is negative");
        }
        if (num == 0) {
            System.out.println("Your number is neutral");
        }
    }

}
