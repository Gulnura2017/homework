package WhileLoops;
import java.util.Scanner;

public class DoWhileLoop1 {
    public static void main(String[] args) {

        int a,b, max, min;
        Scanner sc = new Scanner(System.in);

        String response;

        boolean runAgein;
        do {System.out.println("Please enter two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b){
                max=a;
                min=b;
            }else{
                max=b;
                min=a;
                }
            System.out.println("Maximum digit is "+max);
            System.out.println("Minimum digit is "+min);
            System.out.println("Do you want to continue? yes/no ");


            response=sc.nextLine();
            sc.nextLine();

            if(response.equals("yes")){
                runAgein=false;
            }else {
                runAgein=true;
            }
            }while(runAgein);

    }

    }

