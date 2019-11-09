package Strings;

public class stringMethods {
    public static void main(String[] args) {
        String str = "Hello- World!";
        String devX = "DevX School";
        int sizeOfMyString = str.length();
        System.out.println(sizeOfMyString);
        String str2 = "1234567";
        int sizeOfMyString2 = str2.length();
        System.out.println(sizeOfMyString2);
        System.out.println(str.length());

        char W = str.charAt(7);
        System.out.println(W);
        char hyphen = str.charAt(5);
        System.out.println(hyphen);
        char HInDevX = devX.charAt(7);
        System.out.println(HInDevX);
        char dInHello = str.charAt(10);
        System.out.println(dInHello);


        char lastChar = str.charAt(str.length()-1);
        char h = devX.charAt(devX.length()-4);
        System.out.println(h);
        char mixOf = devX.charAt(devX.length() - 6);
        System.out.println(mixOf);

        String world = str.substring(7);
        System.out.println(world);

        String school = devX.substring(5);
        System.out.println(school);

        String ello = str.substring(1,5);
        System.out.println(ello);

        String or = str.substring(8,10);
        System.out.println(or);

        String XS = devX.substring(3,6);
        System.out.println(XS);
    }

}
