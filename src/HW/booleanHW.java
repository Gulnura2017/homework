package HW;
import java.util.Scanner;
public class booleanHW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int fNum = sc.nextInt();
        System.out.println("input the second number: ");
        int sNum = sc.nextInt();
        System.out.println("Input the third number: ");
        int tNum = sc.nextInt();
        int result = fNum + sNum;
        if (result==tNum) {
            System.out.println("The result is: " + true);
        }
        else System.out.println("false");
    }
}
