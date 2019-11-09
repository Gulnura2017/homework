package WhileLoops;
import java.util.Scanner;
// investment program: how much you contribute, the percentage of the interest,
//we should get number of years required to double the amount,

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Plese enter contribution amount: ");
        double contribution = in.nextDouble();
        System.out.println("Please enter interest rate: ");
        int interest = in.nextInt();
        int year = yearRequired(contribution, interest);
        System.out.println("In "+ year + "you will double you money "+ contribution);


        System.out.println("Enter your loan amount");
        double loanAmount = in.nextDouble();
        System.out.println("Enter num of interest rate ");

    }
    //
    public static int yearRequired(double contributionAmount, int interestRate) {

        double balance = contributionAmount;
        int year = 0;
        while (balance <= contributionAmount * 2) {
            balance = (balance * interestRate / 100) + balance;
            year++;

        }
        return year;
    }
        //you are taking 10000(dynamic) loan, minimum payment is 500(dynamic) monthly.
        //late fee(dynamic)
        //if pay this in 10(dynamic) months you dont get charged for interest.
        //after 10 months every month you will have to pay n% of the balance.

    public static void loanProgram(double loanAmount, double minimumPaymentRequired, int numOfNoInterestMonths, double lateFeeAmount, int interestRate) {
        double balance = loanAmount;
        interestRate = interestRate/12;
        int monthNum = 1;
        while (balance >= 0) {
            System.out.println("Your balance amount: " + (100*balance)/100);
            System.out.println("This is your " + monthNum + " payment. How much you want to pay? ");
            Scanner in = new Scanner(System.in);
            double payment = in.nextDouble();
            if (payment < minimumPaymentRequired) {
                if (monthNum <= numOfNoInterestMonths) {
                    balance = balance - payment + lateFeeAmount;
                }
                else {
                    balance = (balance - payment) + balance * interestRate/100 + lateFeeAmount;
                }
            }
            else {
                if (monthNum <= numOfNoInterestMonths) {
                    balance = balance - payment;
                }
                else {
                    balance = (balance - payment) + balance * interestRate/100;
                }
            }
            monthNum++;
        }
        System.out.println("Loan is paid off... ");
    }
}