package HW;

import java.util.Scanner;
public class SwopTwoInegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first ineger: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After the swap, first integer is: " + number1 + ", second ineger is: " + number2);

    }
}
