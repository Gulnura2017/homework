package HW;
import java.util.Scanner;

public class Merhods {
    public static void main(String[]args) {
        System.out.println("Enter first ineger: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second Ineger: ");
        int b = sc.nextInt();
        int add2Integers = add2Integers(a,b);

    }

    public static int add2Integers(int a, int b){
        int sum = a + b;
        System.out.println("The sum is " + sum);
        return sum;
    }
}
