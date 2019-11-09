package HW;
import java.util.Scanner;
public class TwoLetters {
    public static void main(String[] args) {

        System.out.println("Enter the word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if(word.length()>2){
            System.out.println(word.substring(0,2));
        }else if(word.length()<2){
            System.out.println(word.substring(0,1));
        }

        }


    }

