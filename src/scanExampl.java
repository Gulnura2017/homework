import java.util.Scanner;

public class scanExampl {
    public static void main(String[] args) {

        Scanner inputSomething = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String myString = inputSomething.nextLine();
        System.out.println("Your entered data: " + myString);
    }

}
