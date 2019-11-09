package HW;
import java.util.Scanner;

public class GradesCalc {
    public static void main(String[] args) {
        System.out.println("Enter your Grade for Math: ");
        Scanner sc = new Scanner(System.in);
        int Mathgrade = sc.nextInt();
        System.out.println("Enter your grade for Social Stydies: ");
        int SocGrade = sc.nextInt();
        System.out.println("Enter your grade for Science: ");
        int ScienceGrade = sc.nextInt();
        int averageGrade = (Mathgrade+SocGrade+ScienceGrade)/3;
        if(averageGrade>=80){
            System.out.println("Your grade is 'A'.");
        }
        else if(averageGrade<80 && averageGrade>=60){
            System.out.println("Your grade is 'B'");
        }else if(averageGrade<60 && averageGrade>=40){
                System.out.println("Your grade is 'C'");
            }else {
            System.out.println("Your grade is 'D'");
        }
        }
    }

