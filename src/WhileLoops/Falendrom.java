package WhileLoops;

public class Falendrom {
    public static void main(String[] args) {

         String str1 = "kayak";
         int size = str1.length();
         int index = 0;
    while(index<size/2){
        char ch1 = str1.charAt(index);
        char ch2 = str1.charAt(size-1-index);
        if (ch1==ch2){
            System.out.println(""+ch1 + "==" + ch2);
        }else{
            System.out.println(""+ch1 + "==" +ch2);
            System.out.println("not a palindrom");
            return;
        }

        index++;
    }
        System.out.println("palindrome");
    }


}
