package HW;

import java.util.Scanner;


public class AgeMessage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a message, and I'll display it five times.");
        String message = sc.nextLine();
        int count = 1;
        while(count<=5){
            System.out.println(count+". "+message+".");
            count++;
        }
    }

}

