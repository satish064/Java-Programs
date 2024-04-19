import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Calculator program");
        System.out.print("Enter a first number: ");

        int num1 = input.nextInt();

        System.out.print("Enter a second number: ");

        int num2 = input.nextInt();

        System.out.print("Enter a Operator(+,-,*,/): ");

        char Operator = input.next().charAt(0);

        int result = switch (Operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*','X','x' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> -1;
        };

        System.out.println("Your answer is: "+ result);
    }
}
