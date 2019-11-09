package HW;
import java.util.Scanner;
public class ReplaceLetter {
    public static void main(String[] args) {
        System.out.println("Please enter string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str.replace('x','X'));


    }
}
