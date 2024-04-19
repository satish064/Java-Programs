import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even number checker");
        System.out.printf("So, Enter a number: ");
        int num = input.nextInt();
        String result = num%2==0 ? "Even" : "Odd";
        System.out.printf("Number is: "+result);
    }
}
