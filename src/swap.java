public class swap {
    public static void main(String[] args) {
        int a = 2;
        int b = 24;
        int c = 7;
        int max = a;
        if (b>max) {
            max = b;
        }
        if (c>max){
            max = c;
        }
        if (a>max){
            max = a;
        }
        System.out.println("max is " + max);
    }
}
