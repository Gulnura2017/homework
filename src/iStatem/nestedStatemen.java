
import java.util.Scanner;
             public class nestedStatemen {
                 public static void main(String[] args) {
                     Scanner input = new Scanner(System.in);
                     System.out.println("Please Enter a number");
                     int userGivenNumber = input.nextInt();
                     if(userGivenNumber > 0 ) {
                         System.out.println("Your Number Is Positive");
                         if (userGivenNumber % 2 == 0){
                             System.out.println("Even Number");
                             if(userGivenNumber > 20){
                                 System.out.println("Your number is more than twenty");
                             }
                         }
                         else {
                             System.out.println("Your Number is ODD");
                         }
                     }
                     else if (userGivenNumber < 0) {
                         System.out.println("Your Number is negative");
                     }
                     else
                     {
                         System.out.println("Your Number is zero");
                     }
                 }
             }
