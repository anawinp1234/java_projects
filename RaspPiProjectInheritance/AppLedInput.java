import java.util.ArrayList;
import java.util.Scanner;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class AppLedInput {

    
    public static void main(String[] args) throws InterruptedException {
        Led lightObj = new Led();
        ArrayList<GpioPinDigitalOutput> lightObjArrList = lightObj.getPinsArrList();
        Scanner input = new Scanner(System.in);
        boolean inputCondition = true;
        lightObj.turnAllOff(lightObjArrList);    
            while (inputCondition) {
                System.out.print("Choose a number or quit: ");
                switch (input.nextLine()) {
                case "1":
                    System.out.println("Light 1");
                    lightObj.blink(lightObjArrList.get(0), 700);
                    break;
                case "2":
                    System.out.println("Light 2");
                    lightObj.blink(lightObjArrList.get(1), 700);
                    break;
                case "3":
                    System.out.println("Light 3");
                    lightObj.blink(lightObjArrList.get(2), 700);
                    break;
                case "4":
                    System.out.println("Light 4");
                    lightObj.blink(lightObjArrList.get(3), 700);
                    break;
                case "5":
                    System.out.println("Light 5");
                    lightObj.blink(lightObjArrList.get(4), 700);
                    break;
                case "6":
                    System.out.println("Light 6");
                    lightObj.blink(lightObjArrList.get(5), 700);
                    break;
                case "7":
                    System.out.println("Light 7");
                    lightObj.blink(lightObjArrList.get(6), 700);
                    break;
                case "8":
                    System.out.println("Light 8");
                    lightObj.blink(lightObjArrList.get(7), 700);
                    break;
                case "9":
                    System.out.println("Light 9");
                    lightObj.blink(lightObjArrList.get(8), 700);
                    break;
                case "10":
                    System.out.println("Light 10");
                    lightObj.blink(lightObjArrList.get(9), 700);
                    break;
                case "11":
                    System.out.println("Light 11");
                    lightObj.blink(lightObjArrList.get(10), 700);
                    break;
                case "12":
                    System.out.println("Light 12");
                    lightObj.blink(lightObjArrList.get(11), 700);
                    break;
                case "13":
                    System.out.println("Light 13");
                    lightObj.blink(lightObjArrList.get(12), 700);
                    break;
                case "14":
                    System.out.println("Light 14");
                    lightObj.blink(lightObjArrList.get(13), 700);
                    break;
                case "15":
                    System.out.println("Light 15");
                    lightObj.blink(lightObjArrList.get(14), 700);
                    break;
                case "16":
                    System.out.println("Light 16");
                    lightObj.blink(lightObjArrList.get(15), 700);
                    break;
                case "17":
                    System.out.println("Light 17");
                    lightObj.blink(lightObjArrList.get(16), 700);
                    break;
                case "18":
                    System.out.println("Blink All");
                    lightObj.turnAllOn(lightObjArrList);
                    lightObj.turnAllOff(lightObjArrList);
                    break;
                case "quit":
                    inputCondition = false;
                    System.out.println("Bye...");
                    lightObj.turnAllOff(lightObjArrList);    
                    break;
                    default:
                    System.out.println("Pick a NUMBER between 1-17 you stupid fuck");
                    break;
                } 
            } 
            input.close();
        
    }
}