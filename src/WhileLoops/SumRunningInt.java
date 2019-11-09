package WhileLoops;

public class SumRunningInt {
    public static void main(String[] args) {
        int sum=0;
        int lowerbound = 1;
        int upperbound = 100;
        for( int number=lowerbound; number<=upperbound; ++number){
            sum = (number+number++);
            System.out.println("The sum of 1 to 100 is "+ sum);

        }
    }

}
