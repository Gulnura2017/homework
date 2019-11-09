package HW;

public class sumRunningInt {
    public static void main(String[] args) {

        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;

        for (int number = lowerbound; number <= upperbound; ++number){
            number = sum + ++sum;
            System.out.println("The sum of 1 to 100 is " + number);
        }
    }
}
