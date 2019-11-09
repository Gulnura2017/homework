import java.util.Scanner;

public class FahrengeitToCelcius {
    public static void main(String[] args) {
        // (32f - 32) * 5/9 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fahrenheit; ");

        float fahr = sc.nextFloat();
        float cels = 0;
        System.out.println("result of Celcius is: " + ((fahr - 32) * 5/9));

        System.out.println("Enter gallon: ");

        double G = sc.nextDouble();
        double L = G * 3.785;
        System.out.println("Liter is: " + L);

    }
}
