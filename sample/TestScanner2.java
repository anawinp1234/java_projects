import java.util.Scanner;
public class TestScanner2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type ur fav number: ");
        int num = input.nextInt();
        if (input.equals(num)){
            System.out.println("ur number is: " + num);

        } else {
            System.out.println("Try again");
        }
        input.close();
    }
}