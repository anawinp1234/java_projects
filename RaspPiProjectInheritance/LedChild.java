import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class LedChild extends Led {


    public void fancySnak (ArrayList<GpioPinDigitalOutput> pinNumAll, int speed) throws InterruptedException {

        
        for (int i = 0; i < 4; i++) {
            super.turnAllOff(pinNumAll);
            super.fillOn(pinNumAll, speed);
            super.fillOffReverse(pinNumAll, speed);
            super.fillOnReverse(pinNumAll, speed);
            super.fillOffReverse(pinNumAll, speed);
            super.fillOnReverse(pinNumAll, speed);
        
        }
        super.turnAllOff(pinNumAll);
    }


}
