import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Are you ready for the quiz?");

        int answer1;
        int answer2;
        int answer3;
        String responce = input.next();
        System.out.println();
        System.out.println("ok, here it comes!");
        System.out.println();
        System.out.println("Q1: What is the capital of Alaska?" );
        System.out.println("\t1)Melbourne");
        System.out.println("\t2)Anchorage");
        System.out.println("\t3)Juneau");

        answer1=input.nextInt();
        int score=0;
        if (answer1==3){
            System.out.println("That's correct!");
            score++;
        }else{
            System.out.println("Wrong answer!");
        }
        System.out.println();
        System.out.println("Can you store the value “cat” in a variable of type int?");
        System.out.println("\t1) yes");
        System.out.println("\t2) no");
        answer2=input.nextInt();
        if(answer2==2){
            System.out.println("That's right!");
            score++;
        }else{
            System.out.println("Sorry, wrong!");
        }
        System.out.println("What is the result of 9+6/3?");
        System.out.println("\t1) 5");
        System.out.println("\t2) 11");
        System.out.println("\t3) 15/3");
        answer3=input.nextInt();
        if(answer3==2){
            System.out.println("Correct!");
            score++;
        }else{
            System.out.println("Sorry, incorrect! Try again!");
        }
        System.out.println("Congrts! you score is: " + score);
    }
}
