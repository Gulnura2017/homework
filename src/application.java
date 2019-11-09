import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1, lastName, gender, married;
        int age;
        System.out.println("What is your first name name?: ");
        name1 = sc.next();
        System.out.println("What is your last name? ");
        lastName = sc.next();
        System.out.println("What is your gender? (M or F)");
        gender = sc.nextLine();
        if (gender == "F") {
            System.out.println("Are you married? ");
            System.out.println("yes or no?");
            married = sc.next();
            if (married == "yes") {
                System.out.println("How old are you? ");
                age = sc.nextInt();
                if (age > 20) {

                    System.out.println("Then I shall call you Mrs." + name1 + lastName);
                } else {
                    System.out.println("Then I shall call you Ms." + name1 + lastName);
                }
            } else
                System.out.println(name1 + " " + lastName);
        }
       // if (gender == ("M") {
         //
            System.out.println("Mr." + name1 + lastName);
        //} else
          //  System.out.println(name1 + " " + lastName);

    }

    }

