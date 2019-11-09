package HW;
import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        String alphabet = sc.nextLine().toLowerCase();
        /*if (alphabet=="a" || alphabet=="b" || alphabet=="c"){
            System.out.println(2);
        }
        else if(alphabet=="d" || alphabet=="e" || alphabet=="f")
        { System.out.println(3);}
        else if(alphabet=="g" || alphabet=="h" || alphabet=="i"){
            System.out.println(4);}
        else if(alphabet=="j" || alphabet=="k" || alphabet=="l"){
            System.out.println(5);}
        else if(alphabet=="m" || alphabet=="n" || alphabet=="o")
        { System.out.println(6);}
        else if(alphabet=="p" || alphabet=="q" || alphabet=="r" || alphabet=="s"){
            System.out.println(7);}
         else if(alphabet=="t" || alphabet=="u" || alphabet=="v"){
             System.out.println(8);}
        else if(alphabet=="w" || alphabet=="x" || alphabet=="y" || alphabet=="z")
        { System.out.println(9);}
*/
        switch (alphabet){
            case "a": case "b": case "c":{
                System.out.println(2);
                break;
            }
            case "d": case "e": case "f":{
                System.out.println(3);
                break;
            }
            case "g": case "h": case "i":{
                System.out.println(4);
                break;
            }
            case "j": case "k": case "l":{
                System.out.println(5);
                break;
            }
            case "m": case "n": case "o": {
                System.out.println(6);
                break;}
            case "p": case "q": case "r": case "s": {
             System.out.println(7);
              break;}

            case "t": case "u": case "v":{
             System.out.println(8);
              break;}
            case "w": case "x": case "y": case "z":{
                System.out.println(9);
             break;
            }

        }
         }
}
