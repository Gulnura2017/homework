public class ComparisonOperation {
    public static void main(String[] args) {
      int num1 = 5;
      int num2=10;

      System.out.println("is 5 equal to 10? " + (5==10));
        System.out.println("is 5=5?" + (5==5));
        System.out.println("Is 5.5 = 10.7" + (5.5!=10.7));
        System.out.println("is 5.5=5?" + (5.5==5));
        System.out.println("Is true equal to false? " + (true==false));
        System.out.println("is car = 65?" + ('A' == 65));
        System.out.println("is Hello world = Hello world?" + ("Hello World " != "Hello world"));
        System.out.println("is car A != B?" + ('a' != 'b'));
        System.out.println();

        System.out.println("is 10>=5" + (10>=5));
        System.out.println("is 99.5<99?" + (99.9<99));
        System.out.println("is A < 67" + ('A' < 67));

        int change = (int)(10.99*100);
        float somefloat = 10.5F;
        long someLongNumber = 100000000000l;
        byte someByte = 10;

    }
}
