package HW;
import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int numTerm = sc.nextInt();
        int num= 0;
        while (numTerm >= ++num) {
            System.out.println("Number is; " + num + "and cube of " + num + "is : " + num * num * num);
        }
    }
}