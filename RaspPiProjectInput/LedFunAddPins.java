import java.util.ArrayList;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;


public class LedFunAddPins extends LedFun1 {
    
    ArrayList<GpioPinDigitalOutput> pinArrList = new ArrayList<>();

    final GpioController gpio = GpioFactory.getInstance();            
    final GpioPinDigitalOutput pin16 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01); // 16
    final GpioPinDigitalOutput pin15 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02); // 15
    final GpioPinDigitalOutput pin14 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03); // 14
    final GpioPinDigitalOutput pin13 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04); // 13
    final GpioPinDigitalOutput pin12 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05); // 12
    final GpioPinDigitalOutput pin11 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06); // 11
    final GpioPinDigitalOutput pin1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07); // 01
    final GpioPinDigitalOutput pin10 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21); // 10
    final GpioPinDigitalOutput pin9 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22); // 9
    final GpioPinDigitalOutput pin7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23); // 7
    final GpioPinDigitalOutput pin6 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24); // 6
    final GpioPinDigitalOutput pin4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25); // 4
    final GpioPinDigitalOutput pin8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26); // 8
    final GpioPinDigitalOutput pin17 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00); // 17
    final GpioPinDigitalOutput pin5 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27); // 5
    final GpioPinDigitalOutput pin3 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_28); // 3
    final GpioPinDigitalOutput pin2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29); // 2
    pinArrList.add(pin1);
    pinArrList.add(pin2);
    pinArrList.add(pin3);
    pinArrList.add(pin4);
    pinArrList.add(pin5);
    pinArrList.add(pin6);
    pinArrList.add(pin7);
    pinArrList.add(pin8);
    pinArrList.add(pin9);
    pinArrList.add(pin10);
    pinArrList.add(pin11);
    pinArrList.add(pin12);
    pinArrList.add(pin13);
    pinArrList.add(pin14);
    pinArrList.add(pin15);
    pinArrList.add(pin16);
    pinArrList.add(pin17);
    
    
    
}
