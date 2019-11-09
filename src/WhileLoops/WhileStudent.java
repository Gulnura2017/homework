package WhileLoops;
import java.util.Scanner;
public class WhileStudent{
    public static void main(String[] args) {

            double num= 0;
            double x=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the number(n) you want to calculate the average: ");//25
            //number of students
            int n= sc.nextInt();
            while(x <= n){
                System.out.println("Enter your mark: " + (int)x );
                num += sc.nextDouble();
                x+=1;
            }
            double avg =(num/n);
            System.out.println("Average: " + avg);
        }

    }



