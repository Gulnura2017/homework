package HW;

public class StringFirstLetterUperCase {
    public static void main(String[] args) {

        String fName = "gulnura";
        String sName = "apazbek";
        fName = fName.trim();
        sName = sName.trim();
        String firstLetterOfName = fName.substring(0,1);
        String firstLetterOfSName = sName.substring(0,1);

        String convertToUpperCase = firstLetterOfName.toUpperCase();
        String convertToUpperCase2 = firstLetterOfSName.toUpperCase();
        System.out.println(convertToUpperCase+fName.substring(1,7));
        System.out.println(convertToUpperCase2+sName.substring(1,7));
    }
}
