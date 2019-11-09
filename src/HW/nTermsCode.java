package HW;
import java.util.Scanner;
public class nTermsCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms: ");
        int numTerms = sc.nextInt();
        int num = 1;
        num=num++;



        while (numTerms > num++) {
            System.out.println("The odd numbers are: ");
            int odd = num++ % 2;
            if (odd!=0) {
                System.out.println(num++);
            }
        }


    }
}