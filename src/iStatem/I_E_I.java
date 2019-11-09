package iStatem;

import java.util.Scanner;

public class I_E_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberFromUser = input.nextInt();

        if(numberFromUser >=0) {
            System.out.println("Your number is positive");
        }
        else if (numberFromUser == 0) {
            System.out.println("Your number is 0");
        }
        else {
            System.out.println("Your number is negative");
        }
    }
}
