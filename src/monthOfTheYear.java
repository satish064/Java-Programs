import java.util.Scanner;

public class monthOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to month checker(1-12)");
        System.out.print("Enter a number(1-12): ");

        int month = input.nextInt();

        String output = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invaild";
        };

        System.out.printf("Month is: "+output);
    }
}
