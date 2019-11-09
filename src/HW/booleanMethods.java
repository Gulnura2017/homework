package HW;
import java.util.Scanner;
public class booleanMethods {
    public static void main (String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
       boolean evenOrOdd = isOdd(number);
    }
     public static boolean isOdd(int num){

        boolean even = true;
        if (num%2==0)
        {
            System.out.println(num + " is an even number");
        }else{
            System.out.println(num + " is an odd number");
        }
        return even;
     }

}
