// import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int N = scanner.nextInt();
        int N = 154;


        int sum = 0;
        while (N != 0) {
            sum += N % 10;
            N /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
