package HW;

import java.util.Scanner;

public class SumProductMinMax {
    public static int num1, num2, num3;
    public static int sum, product, min, max;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        System.out.println("Enter the third number");
        num3 = input.nextInt();
        sum(); // static method sum () that we are calling
        product();
        max();
        min();
    }
    // custom method
    public static void sum(){
        sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);
    }
    public static void product(){
        product = num1 * num2 * num3;
        System.out.println("The product is: " + product);
    }
    public static void max(){
        if (num2>max) {
            max=num2;
        }
        if (num3>max){
            max=num3;
        }

        if (num1>max){
            max=num1;
        }
        System.out.println("The maximum is " + max);
    }
    public static void min(){
        if (num2<min) {
            min=num2;
        }
        if (num3<min){
            min=num3;
        }

        if (num1<min){
            min=num1;
            System.out.println("The minimum" + min);
        }
    }
}
