import java.util.Scanner;


public class trafficLight {
    public static void main(String[] args) {
        Scanner inpNum = new Scanner(System.in);
        System.out.println("Enter number for the traffic light: ");
        int answer = inpNum.nextInt();

        switch (answer) {
            case 1:
                System.out.println("red color");
                break;
            case 2:
                System.out.println("yellow color");
                break;
            case 3:
                System.out.println("green color");
                break;
            default:
                System.out.println("not valid traffic light color");
                break;
        }


    }

}
