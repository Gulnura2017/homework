import java.util.Scanner;
public class BuleanExample {


    public static void main(String args[])
    {
        System.out.println("Does the wall painted?");
        Scanner Wall=new Scanner(System.in);
        boolean isTheWallPainted = Wall.nextBoolean();

        System.out.println("Does the wall coclored?");
        boolean isTheWallColored = Wall.nextBoolean();
        boolean isTheMenegerHappy = isTheWallColored || isTheWallPainted;
        System.out.println("Is the Manager happy?" + isTheMenegerHappy);


    }
}

