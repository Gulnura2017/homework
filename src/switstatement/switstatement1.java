package switstatement;
import java.util.Scanner;

public class switstatement1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your month");

        int monthNum = sc.nextInt();

        String month;
        String season;

        switch (monthNum) {
            case 1:
                month = "January";
                season = "Winter";
                break;
            case 2:
                month = "February";
                season = "Winter";
                break;
            case 3:
                month = "March";
                season = "Spring";
                break;
            case 4:
                month = "April";
                season = "Spring";
                break;
            case 5:
                month = "May";
                season = "Spring";
                break;
            case 6:
                month = "June";
                season = "Summer";
                break;
            case 7:
                month = "July";
                season = "Summer";
                break;
            case 8:
                month = "August";
                season = "Summer";
                break;
            case 9:
                month = "September";
                season = "Fall";
                break;
            case 10:
                month = "Oktober";
                season = "Fall";
                break;
            case 11:
                month = "November";
                season = "Fall";
                break;
            case 12:
                month = "December";
                season = "Winter";
                break;
            default:
                month = "Invalid month number";
                season = "invalid month number";
                break;
        }
            System.out.println(month);
            System.out.println(season);
        }
    }


