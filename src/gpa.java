import java.util.Scanner;
    public class gpa {

        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.println("What is a level of your GPA? ");
            double gpa = num.nextDouble();
            if (gpa > 3.5) {
                System.out.println("You can get job");
            }

            else{
                System.out.println("You can't get a job");
                System.out.println("You shoud try again when you add" + (3.5 - gpa)+"more scores");
            }

        }
    }