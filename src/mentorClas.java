import java.util.Scanner;

public class mentorClas {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month ");
        int month = sc.nextInt();
        System.out.println("enter year of your birthday");
        int year = sc.nextInt();
        int age = age(year);
        String season = season(month);
        System.out.println("Testing" + season + age) ;

        if (age>=0&& age<13){
            System.out.println("This person is a kid" + "and age is " + age + "he/she was born is " + season);
        }
        if ( age < 20){
            System.out.println("This person is a teenage" + "and age is " + age + "he/she was born is " + season);
        }

    }
    public static int age(int inputYear){
        int age = 2019 - inputYear;
        if (age <0){
            System.out.println("Invalid year");
            return 0;
        }
        return age;
    }

    public static String season(int month){
        String season = "";
        if (month==3 | month == 4 || month == 5){
            season = "Spring";
        }else if (month>=6 && month<=8) {
            season = "Summer";
        }else if (month>8 || month<=11){
         season = "Fall";
        }else if (month >=1 || month==12){
            season = "Winter";
        }

return null;
    }
}
