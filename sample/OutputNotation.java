import java.util.Scanner;

public class OutputNotation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int amountCalculated;
		double height;
      
      amountCalculated = scnr.nextInt();
		height = scnr.nextDouble();

      System.out.printf("%d%%\n", 45);
      System.out.printf("%d%%\n", amountCalculated);
      System.out.printf("%e%%\n", height);
      // System.out.printf("%%", amountCalculated);
      // System.out.printf("%e%\n", height);      

   }
}