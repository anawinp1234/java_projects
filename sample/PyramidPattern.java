// import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number of levels: ");
        // int N = scanner.nextInt();
        int N = 15;

        for (int i = 1; i <= N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}