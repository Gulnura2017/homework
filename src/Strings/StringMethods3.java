package Strings;
import java.util.Scanner;
public class StringMethods3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you Left handed or Right handed?");
        String str = sc.nextLine();

        if (str.equals("left")){
            System.out.println("Sit on the left connor of the table");
        }else if (str.equals("right")){
            System.out.println("Sit on the right connor of the table");
        }else {
            System.out.println("Invalid input.");
        }

        System.out.println("Please enter you username");
        String username = "Gulnura2017";
        String username1 = sc.nextLine();
        System.out.println("Please enter your password");
        String password = "ChaseBankPass222";
        String passEntered = sc.nextLine();
        if (passEntered.equals(password) && username1.equals(username)){
            System.out.println("You are Successfully logged in");
        }else {
            System.out.println("Invalid Password entered");
        }

        System.out.println( "Where are you from?");
        String origin = sc.nextLine();
        System.out.println(origin.toLowerCase());
        if(origin.toLowerCase().contains("stan")){
            System.out.println("you are the central asian folk");
        }

        String lone = "Lone";
        String bone = lone.replace("L","B");
        System.out.println(bone);
    }


}
