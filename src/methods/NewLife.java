package methods;

public class NewLife {

    public static void main(String[] args) {
        boolean firstExsample = isOldEnoughToDrive(17);
        System.out.println("Are you eligable to drive? " + firstExsample);

        boolean secondExample = isOldEnoughToDrive((23));
        System.out.println("Are you eligable to drive? " + secondExample);

        boolean thirdExample = isOldEnoughToDrive(35);
        System.out.println("Are you eligable to drive? " + thirdExample);

        double change1 = calculateTheChange(102.56, 120.00);
        System.out.println("Your change: " + change1);

        printOutMyName(" John Doe ");
        printOutMyName(" Gulnura");
        printOutMyName(" Abdulaziz");

        printSSN("000-456-345");

        double change3 = calculateTheChange(520.23, 200);
        System.out.println("Your change is " + change3);

        double change4 = calculateTheChange(100.23, 200);
        System.out.println("Your change is " + change4);
    }

    public static boolean isOldEnoughToDrive(int age){

        boolean isOldEnough;
        if (age>=18){
            isOldEnough = true;
        }
        else{
            isOldEnough = false;
        }
    return isOldEnough;
    }
    public static double calculateTheChange(double total, double cashRecieved){
        double change = ((cashRecieved*100) - (total*100))/100;
        if (total <= cashRecieved){
            change = ((cashRecieved*100) - (total*100))/100;

        return change;
        }
        else {
            System.out.println("You dont have enough money ");
            System.out.println("you need " + (cashRecieved-total));
            change = 0;
        }
        return change;
    }

    public static void printOutMyName(String name){
        System.out.println("Your name is" + name);
    }
    public static void printSSN(String ssn){
        System.out.println("my ssn: " + ssn);
    }
    public static boolean isNumberEvenNumber(int num){

        return num%2==0;
    }
    public static void AllMethods(){

    }
}
