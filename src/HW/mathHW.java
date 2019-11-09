package HW;
import java.util.Scanner;
public class mathHW {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int int1 = sc.nextInt();
        System.out.println("Please enter second integer: ");
        int int2 = sc.nextInt();
        int sum, difference, product,  distance, max, min;
        double average;
        sum = int1 + int2;
        difference = int1-int2;
        product = int1*int2;
        average = (int1+int2)/2;
        distance = int1-int2;
        System.out.println("Sum of two integers is: " + sum);
        System.out.println("Difference of two integers is: " + difference);
        System.out.println("Product of two integers is: " + product);
        System.out.println("Average of two integers is: " + average);
        System.out.println("Distance of two integers is: " + distance);
        if (int1>int2){
            System.out.println("Max integer: " + int1);
            System.out.println("Min integer: " + int2);
        }else{
            System.out.println("Max integer: " + int2);
            System.out.println("Min integer: " + int1);
        }
    }

}
