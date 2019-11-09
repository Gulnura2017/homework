
import java.util.Scanner;
public class IfStatement {

public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    System.out.println("Please enter you full name: " );
    String fullName = input.next();
    System.out.println("Please enter you full age: " );
    int age = input.nextInt();

    if (age>=18) {
        System.out.println(fullName + " can vote " );
        System.out.println("Don't vote to Trump! " );
    }


    System.out.println("I'm outside of any if statements " );
    System.out.println("So I run regardless" );

    System.out.println("What time is it now? " );

    int hour = input.nextInt();
    if (hour>=0 && hour<=11);
    {
        System.out.println("Good morning my beautiful World!" );
    }
        hour++;
        System.out.println("The next hour will be " + hour);


    }
}
