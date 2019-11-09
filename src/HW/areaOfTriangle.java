
package HW;
import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the width of the triangle: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println("Enter the width of the triangle: ");
        int width = sc.nextInt();
        System.out.println("Area of the triangle is: " + (height*width)/2);

    }
}
