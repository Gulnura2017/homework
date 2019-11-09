import java.util.Scanner;
public class CalculatorExample
{
    public static void main(String[] args) {
        Scanner san=new Scanner(System.in);
        System.out.println("Please enter your number1: ");
        int number1=san.nextInt();
        System.out.println("Please enter your number2: ");
        int number2 = san.nextInt();
        int division = number1 / number2;
        System.out.println("Your division is :" + division );
    }
}
