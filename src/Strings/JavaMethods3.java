package Strings;

import java.util.Scanner;

import java.util.Scanner;

public class JavaMethods3 {
    public static void main(String[] args) {
        //System.out.println(containsBoolean);
        //System.out.println(a=b=c);

        String a = "java";
        String b = "JAVA";
        String c = "Python";
        boolean containsBoolean = a.contains("java");
        System.out.println(containsBoolean);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your last name");

        String lastName = in.nextLine();
        if (lastName.contains("ova")){
            System.out.println("You are a female");
        }else {
            System.out.println("You are not female");
        }
        String str1 = "DevX";
        String str2 = str1.concat("School");
        System.out.println(str2);


        String samsung = "SAMSUNG Digital World";
        int index = samsung.indexOf("S");
        int indexOfSamsung = samsung.indexOf("tal");
        System.out.println(indexOfSamsung);
        int indexOfV = samsung.indexOf("Vor");
        System.out.println(indexOfV);
    }
}