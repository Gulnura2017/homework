import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        String product = "coke";
        double price = 1.10;
        double change;
        int bill;
        int quarters, dimes, nickels,pennies;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your bill for coke price is: " + price);
        bill = sc.nextInt();
        change = bill - price;
        int changeCent = (int)(change * 100);
        System.out.println("Your change is: " + change);
        quarters = changeCent/25; // how many quarters;
        changeCent = changeCent%25; //15
        dimes = changeCent/10; //how many dimes
        changeCent%=10;//5
        nickels = changeCent/5; //how many nickels
        pennies = changeCent%5;

        System.out.println(quarters + " quarters ");
        System.out.println(dimes + " dimes ");
        System.out.println(nickels + " nickels ");
        System.out.println(pennies + " pennies");
    }




}

