package HW;

public class ChaeckPassFail {
    public static void main(String[] args) {
        int mark = 49;
        System.out.println("The mark is " + mark);
        Check(mark);

    }

    public static void Check (int mark1){
        if(mark1 >= 50){
            System.out.println("You passed the exam");
        }else{
            System.out.println("You failed");
        }
        System.out.println("Passing mark is 50");
    }
}
