import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class AppLedFun1 {

    public static void main(String[] args) throws InterruptedException {
        
        Led pinsObj = new Led();
        


        ArrayList<GpioPinDigitalOutput> newPinsArrList = pinsObj.getPinsArrList();

        
        int n = 1;
        for (GpioPinDigitalOutput eachElem : newPinsArrList) {
            System.out.println("light up GPIO_" + n );
                // blink(eachElem, 500);    
                pinsObj.blink(eachElem, 100); 
                pinsObj.turnAllOn(newPinsArrList);
                pinsObj.turnAllOff(newPinsArrList);
            n++;
        }

        
        pinsObj.turnAllOff(newPinsArrList);
        pinsObj.endToEnd(newPinsArrList);
        pinsObj.randomOn(newPinsArrList);
        pinsObj.pingPong(newPinsArrList);
        pinsObj.snake(newPinsArrList);
        pinsObj.randomOnThree(newPinsArrList);
        pinsObj.lightSpread(newPinsArrList);
        pinsObj.lightSpreadOff(newPinsArrList);
        pinsObj.lightOdd(newPinsArrList);
        pinsObj.lightEven(newPinsArrList);
        Thread.sleep(500);
        pinsObj.turnAllOff(newPinsArrList);
        for (int i = 0; i < 7; i++) {
            pinsObj.turnAllOn(newPinsArrList);
            pinsObj.turnAllOff(newPinsArrList);
        }
    } // end of main
} // end of class