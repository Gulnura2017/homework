import java.util.Scanner;

public class testData
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int x = sc.nextInt();
        int y = x*1;
        int a = x*2;
        int b = x*3;
        int c = x*4;
        int d = x*5;
        int e = x*6;
        int f = x*7;
        int g = x*8;
        int h = x*9;
        int i = x*10;

        System.out.println( x + "* 1=" + y);
        System.out.println( x + "* 2=" + a);
        System.out.println( x + "* 3=" + b);
        System.out.println( x + "* 4=" + c);
        System.out.println( x + "* 5=" + d);
        System.out.println( x + "* 6=" + e);
        System.out.println( x + "* 7=" + f);
        System.out.println( x + "* 8=" + g);
        System.out.println( x + "* 9=" + h);
        System.out.println( x + "* 10=" + i);

    }

}
