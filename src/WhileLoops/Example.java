package WhileLoops;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) throws InterruptedException {
        String str = "You are AWESOME!!";
        boolean isAwsome = true;
        int count = 0;
        while(isAwsome){
            System.out.println(str);
            count++;
            if (count>=3){
            isAwsome=false;}
        }
        int count2=0;
        while (count2<4){
            System.out.println(str+"While Loop is endless");
            count2++;
        }

        int count3=5;
        while (count3>0){
            System.out.println(count3--);
            Thread.sleep(1000L);
            if (count3==0){
                System.out.println("Kabooom!!!");
            }
        }

        String str1 = "";
        // "G" stop the programm when my str1 is "GGG"

        while(!str1.equals("GGG")){
        str1=str1.concat("G");
            System.out.println(str1);

        }
        System.out.println(str1);


        String str3="Hello my friend";
        int i = 0;
        while(i<str3.length()){
            System.out.print(str3.charAt(i)+ " ");
            i++;
        }
        //Ask the user to enter score for tes1, test2, test3;
        //calculate the avarage  score
        //if the avarage is <60
        //print out you have to take the exam again
        //repeat the program
        //if its >60 print out you hane passed the class
        //end the program

        boolean isTestPass = true;
        while(isTestPass) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter your score for test1");
        int score1= sc.nextInt();
        System.out.println("Enter your score for test2");
        int score2 = sc.nextInt();
        System.out.println("Enter your score for test3");
        int score3 = sc.nextInt();
        int average = (score1 + score2 + score3)/3;

            if (average < 60){
                System.out.println("You have to take the exam again");
            }else{
            System.out.println("You passed the class");
            isTestPass=false;
        }
    }
        // Loggin attempts
        Scanner sc = new Scanner(System.in);
        String passWord = "ChaseBankPass222";
        String userName = "DevX School";
        boolean retry = true;
        int retryCount = 0;
        while (retry  && retryCount < 3) {
            System.out.println("Please Enter your user Name");
            String userNameEntered = sc.nextLine();
            System.out.println("Please Enter your password");
            String passEntered = sc.nextLine();
            if (userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)) {
                System.out.println("You are Successfully Logged in");
                retry = false;
            } else {
                System.out.println("Invalid UserName or Password entered");
                retryCount++;
            }
        }
    }
}
