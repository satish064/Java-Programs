import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absolute value checker");
        System.out.printf("So, Enter a number: ");
        int num = input.nextInt();

        int result = num < 0 ? (num * -1) : num;

        System.out.printf("Absolute value is: "+result);
    }
}
