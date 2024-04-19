import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Score");
        System.out.print("Please enter your marks: ");
        int marks = input.nextByte();

        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");

        System.out.println("Your category is: "+category);

    }
}
