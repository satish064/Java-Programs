import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to factorial calculator: ");
        System.out.printf("So, Enter a number: ");
        int num = input.nextInt();

        long result = factorial(num);

        System.out.printf("Factorial is: "+result);
    }
    public static long factorial(int num) {
        if(num == 0 || num == 1)
            return 1;
        return num * (factorial(num - 1));
    }
}
