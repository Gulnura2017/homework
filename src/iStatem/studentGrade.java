package iStatem;

import java.util.Scanner;

public class studentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your Score of quiz: ");
        int quizScore = input.nextInt();
        if(quizScore <0 || quizScore> 100); {
            System.out.println("your score is invalid.");
        System.exit(0);
        }
        System.out.println("please enter you mid-term score: ");
        int midtermScore = input.nextInt();
        System.out.println("please enter your final exam score");
        int finelScore = input.nextInt();
        int avarage = (quizScore + midtermScore + finelScore)/3;

     if (avarage >=90 && avarage <=100){
         System.out.println("Your grade is 'A'");
     }
     else if (avarage >=70 && avarage <90){
         System.out.println("Your grade is 'B'");
     }
     else if (avarage >=50 && avarage <70){
         System.out.println("Your grade is 'C'");
     }
     else if (avarage<50 && avarage >0){
         System.out.println("Your grade is D");
     }
     else {
         System.err.println("Avarage score must be in range of 0 - 100...Please try again!!!");
     }
    }
    }
