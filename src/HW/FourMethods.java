package HW;

public class FourMethods {
    public static void main(String[] arg){

        int sum = addNumbers(21, 3);
        System.out.println("Sum of (a + b) is: "+sum);

        int division =divideNumbers(21,3);
        System.out.println("Division (a/b) is: " + division);

        int multiplication = multiplyNumbers(21,3);
        System.out.println("multiplication of (a*b) is: " + multiplication);
        int subtraction = subtractNumbers(21,3);
        System.out.println("Suntraction of (a - b) is: " + subtraction);
    }

    public static int addNumbers(int a, int b){
        return a+b;
    }
    public static int divideNumbers (int a, int b){
        return a/b;
    }
    public static int multiplyNumbers(int a, int b){
        return a*b;
    }

    public static int subtractNumbers(int a, int b){
        return a-b;
    }
}
