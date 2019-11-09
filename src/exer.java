import java.util.Scanner;

public class exer{

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        if (age >= 18)
        {
            System.out.println("You can apply for a DV");
        }
        else {
            System.out.println("You are not eligable to aply for DV");
            System.out.println("You have to wait for" + (18 - age) + "more years");}
        }
    }

