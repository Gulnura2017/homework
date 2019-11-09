import java.util.Scanner;

public class farengeitToCels {
    public static void main(String args[])
    {
    Scanner sc= new Scanner (System.in);
        System.out.println("Enter Fahrenheit: ");
    double F = sc.nextDouble();
    double C = (F - 32) *5/9;
        System.out.println(F + "degree in Celsius =" + C);

        System.out.println("Enter number in inches: ");
        double Inch = sc.nextDouble();
        double Metr = Inch * 0.0254;
        System.out.println(Inch +" inch is " + Metr + " meters");

    }
}

