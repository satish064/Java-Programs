import java.util.Scanner;

public class minumumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Welcome to big number checker\n");
        System.out.printf("So, Enter the first number: ");
        int num1 = input.nextInt();
        System.out.printf("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.printf("Greatest Number is: "+bigNumber(num1,num2));
    }
    public static int bigNumber(int num1,  int num2) {
        int big = (num1 > num2) ? num1 : num2;
        return big;
    }
}
