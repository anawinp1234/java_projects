import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class AppLedInher {
    public static void main(String[] args) throws InterruptedException {
        Led pinsObj = new Led();
        ArrayList<GpioPinDigitalOutput> pinsObjArrList = pinsObj.getPinsArrList();
        // LedChild inherObj = new LedChild();


        // inherObj.fancySnak(pinsObjArrList, 400);
        pinsObj.fancySnake(pinsObjArrList, 400);
    }
}
