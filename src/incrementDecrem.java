public class incrementDecrem
{
    public static void main (String[] arg) {

        int num1 = 100;
        int num2 = 200;

        num1++;
        num2--;

        System.out.println("Number one is: " + num1);
        System.out.println("Number two is: " + num2);

        num1--;
        num2++;

        System.out.println("Number one is " + num1);
        System.out.println("Number two is: " + num2);

        int num1_1 = num1;
        System.out.println("Number one pre increment " + ++num1);
        System.out.println("Number one.one post increment: " + num1_1++);

        int y = 100;
        int x = 500;
        System.out.println("Y pre increment: " + ++y); // pre increment y=101
        System.out.println("x value: " + ++x); //x=501
        System.out.println("x value: " + x++); //x=501
        System.out.println("x value " + ++x);  //x=503
        System.out.println("x value " + x++); //503
        System.out.println("x value " + x); //504

        int i = 10;
        int z = 18;

        int result = i++;

        System.out.println("Result value is " + result) ;
        System.out.println("resulr second " + result);
        System.out.println("result " + ++result);

        int pre = 8;
        int prerezult = ++pre;
        System.out.println("result pre " + ++pre);


    }


}
