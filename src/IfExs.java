import java.util.Scanner;

public class IfExs {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it ???");

        int hour = input.nextInt();

        System.out.println("Is it am or pm?");
        char amOrPm = input.next().charAt(0);
        if (hour >= 0 && hour < 11 && amOrPm == 'a') {
            System.out.println("Good morning");
        }
        if (hour < 0 && hour <= 6 && amOrPm == 'p') {
            System.out.println("Good evening");
        }
    }
}
