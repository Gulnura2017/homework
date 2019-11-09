import java.util.Scanner;

public class calcScan {
    public static void main(String[] args) {

        System.out.println("please enter you number: ");

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        System.out.println("enter second number: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        int multiple = number1 * number2;
        System.out.println("Sum of numbers is:  " + sum);
        System.out.println("Multiple of number is: " + number1 * number2);


    }
}
