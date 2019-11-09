package HW;
import java.util.Scanner;

public class maxOrMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number? ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number? ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number? ");
        int num3 = sc.nextInt();
        int max = num1;
        if (num2>max) {
            max=num2;
        }
        if (num3>max){
            max=num3;
        }

        if (num1>max){
            max=num1;
        }
        System.out.println("The greatest number: " + max);

    }
}
