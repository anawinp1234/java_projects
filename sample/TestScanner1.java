import java.util.Scanner;

public class TestScanner1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type ur fav number: ");
        System.out.println("ur name is: " + input.nextLine());
        input.close();
    }
}
