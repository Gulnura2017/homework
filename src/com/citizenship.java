package com;
import java.util.Scanner;

public class citizenship {
    public static void main(String[] arg){

    Scanner sc = new Scanner(System.in);

    System.out.println("Are you a permanent resident of US? Please enter yes or now");
        boolean greenCardHolder = sc.nextBoolean();

        if(greenCardHolder){
            System.out.println("How long have You lived in US?");
            int yearsInUS = sc.nextInt();
            if(yearsInUS >=5){
                System.out.println("Did you pass the exam? true or false");
                boolean examPassed = sc.nextBoolean();
                if(examPassed){
                    System.out.println("You are eligable for the citizenship");
                }
                else {
                    System.out.println("You are not eligible for citizenship becouse you did'nt pass exam");
                }

            }else {
                System.out.println("you need to be in US " + (5-yearsInUS) + "more years");
            }
        } else {
            System.out.println("You are not eligible for citizenship becouse U R not greencard holder");
        }
    }

}
