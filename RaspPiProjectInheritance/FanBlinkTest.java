import java.util.ArrayList;
import java.util.Scanner;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class FanBlinkTest {
    public static void main(String[] args) throws InterruptedException {
        Led fblink = new Led();
        ArrayList<GpioPinDigitalOutput> fblinkArrList = fblink.getPinsArrList(); 
        int speed = 400;
            fblink.fancySnak(fblinkArrList, speed);
            
        
    }
}
