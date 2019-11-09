package HW;

import java.util.Scanner;
public class multiplicationOfNumber {
    public static void main(String[] args) {
        System.out.println("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termNum = sc.nextInt();
        int num = 0;
        while (termNum>=num){
            System.out.println(termNum + "X" + num + "=" + (termNum*num++));
        }
    }
}
