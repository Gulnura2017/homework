package methods;

public class ExampleString {



    public static void main(String[] args) {
    int result = findPerimeter(5,6);
        System.out.println(result);

        findPerim2(10,14);
        System.out.println("First method is: " + result);
        System.out.println("Second method is " + findPerimeter(8,9));

    }

    public static int findPerimeter(int a, int b){
        return (2*a) + (2*b);
    }
    public static void findPerim2(int a, int b){
        int perimeter = 2*(a+b);
        System.out.println(perimeter);
    }

}
