import java.util.Scanner;

public class TestInput {
    
    public void testInputMethTest() {

        Scanner input = new Scanner(System.in);
        boolean inputCondition = true;
        
        while (inputCondition) {
            System.out.print("Choose a number or quit: ");
            switch (input.nextLine()) {
                case "1":
                System.out.println("Light 1");
                break;
                case "2":
                System.out.println("Light 2");
                break;
                case "3":
                System.out.println("Light 3");
                break;
                case "4":
                System.out.println("Light 4");
                break;
                case "5":
                System.out.println("Light 5");
                break;
                case "6":
                System.out.println("Light 6");
                break;
                case "7":
                System.out.println("Light 1");
                break;
                case "8":
                System.out.println("Light 2");
                break;
                case "9":
                System.out.println("Light 3");
                break;
                case "10":
                System.out.println("Light 4");
                break;
                case "11":
                System.out.println("Light 5");
                break;
                case "12":
                System.out.println("Light 6");
                break;
                case "13":
                System.out.println("Light 1");
                break;
                case "14":
                System.out.println("Light 2");
                break;
                case "15":
                System.out.println("Light 3");
                break;
                case "16":
                System.out.println("Light 4");
                break;
                case "17":
                System.out.println("Light 5");
                break;
                case "quit":
                inputCondition = false;
                System.out.println("Bye...");
                break;
                default:
                System.out.println("Pick a NUMBER between 1-17 you stupid fuck");
                break;
            } 
        } 
        input.close();
    }
}