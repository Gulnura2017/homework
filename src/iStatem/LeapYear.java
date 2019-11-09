package iStatem;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] arg){

        //evenly divisible by 4,by 100, 400
        // the year is leap when it's evenly divisible by 4
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year...");

        year = sc.nextInt();

        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {

                    System.out.println("Year is leap 21");
                }
                else {
                    System.out.println("year is not leap 24");
                }
            }
            else {
                System.out.println("year is leap 28");
            }
        }
        else {
            System.out.println("Year is not leap32");
        }

    }
}
