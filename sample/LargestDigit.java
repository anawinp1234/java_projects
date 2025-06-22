// import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int N = scanner.nextInt();
        int N = 4878;


        int largest = 0;
        while (N != 0) {
            int digit = N % 10;
            if (digit > largest) {
                largest = digit;
            }
            N /= 10;
        }

        System.out.println("Largest digit: " + largest);
    }
}
