import java.util.Scanner;

public class collegeCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which year in collage?: ");
        int year = sc.nextInt();

        System.out.println("What is your major?");
        String major = sc.next();
        String course = sc.next();
        switch (major) {
            case "CS":
                switch (year) {
                    case 1:
                        course = "Basic Algebra";
                        break;
                    case 2:
                        course = "Advanced Algebra";
                        break;
                    case 3:
                        course = "Trigonometry";
                        break;
                    case 4:
                        course = "Calc";
                        break;
                    case 5:
                        course = "Calc 2";
                        break;
                }
                break;
            case "Economics":
                switch (year) {
                    case 1:
                        course = "Basic Algebra";
                        break;
                    case 2:
                        course = "Advanced Algebra";
                        break;
                    case 3:
                        course = "Statistic";
                        break;
                    case 4:
                    case 5:
                        course = "You are done with math. Enjoy your life";
                        break;
                    default:
                        System.out.println("enter valid year number");
                        break;
                }
                break;
            default:
                System.out.println("we don't have that kind of classes yet.");
                break;
        }
        System.out.println("Course info " + course);
    }
}