import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class Led {

   public ArrayList<GpioPinDigitalOutput> pinArrList = new ArrayList<>();


    public Led() {
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

        // pinArrList = arrList;
    }
    
     

    public ArrayList getPinsArrList() throws InterruptedException {
        return pinArrList;
    }
    

    public static void fancySnake (ArrayList<GpioPinDigitalOutput> pinNumAll, int speed) throws InterruptedException {
        int sp = speed;
        for (int i = 0; i < 1; i++) {

            fillOn(pinNumAll, sp);
            sp = sp - 100;
            fillOffReverse(pinNumAll, sp);
            
            fillOnReverse(pinNumAll, sp);
            sp = sp - 100;
            fillOffReverse(pinNumAll, sp);
            
            fillOnReverse(pinNumAll, sp);
            sp = sp - 100;
            fillOffReverse(pinNumAll, sp);
            
            fillOnReverse(pinNumAll, sp);
            sp = sp - 30;
            fillOffReverse(pinNumAll, sp);

            for (int j = 0; j < 4; j++) {
                sp = sp - 15;
                fillOnReverse(pinNumAll, sp);
                snake(pinNumAll, sp);
            }
        }
  
        
    }

    public static void blink(GpioPinDigitalOutput pinNum, int speed) throws InterruptedException {
        int sp = speed;
        pinNum.low();
        pinNum.high();
        Thread.sleep(sp);
        pinNum.low();
        Thread.sleep(sp);
        // Thread.sleep(500);
        // pinNum.high();
        // Thread.sleep(1000);
        // pinNum.low();
        // Thread.sleep(700);
    }

    public static void turnAllOff(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        for (GpioPinDigitalOutput eachPin : pinNumAll) {
            eachPin.low();
        }
        Thread.sleep(400);
        System.out.println("All are off");
    }

    public static void turnAllOn(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        for (GpioPinDigitalOutput eachPin : pinNumAll) {
            eachPin.high();
        }
        Thread.sleep(400);
        System.out.println("All are on");
    }

    public static void fillOff(ArrayList<GpioPinDigitalOutput> pinNumAll, int speed) throws InterruptedException {
        for (GpioPinDigitalOutput eachPin : pinNumAll) {
            eachPin.low();
            Thread.sleep(speed);
        }
        System.out.println("Fill off done");
    }

    public static void fillOn(ArrayList<GpioPinDigitalOutput> pinNumAll, int speed) throws InterruptedException {
        for (GpioPinDigitalOutput eachPin : pinNumAll) {
            eachPin.high();
            Thread.sleep(speed);
        }
        System.out.println("Fill on done");
    }

    public static void fillOnReverse(ArrayList<GpioPinDigitalOutput> pinNumAllRe, int speed) throws InterruptedException {
        Collections.reverse(pinNumAllRe);
        for (GpioPinDigitalOutput eachElem : pinNumAllRe) {
            eachElem.high();
            Thread.sleep(speed);
        }
    }

    public static void fillOffReverse(ArrayList<GpioPinDigitalOutput> pinNumAllRe, int speed) throws InterruptedException {
        Collections.reverse(pinNumAllRe);
        for (GpioPinDigitalOutput eachElem : pinNumAllRe) {
            eachElem.low();
            Thread.sleep(speed);
        }
    }

    public static void lightEven(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        for (GpioPinDigitalOutput eachElem : pinNumAll) {
            if (pinNumAll.indexOf(eachElem) % 2 != 0) {
                eachElem.high();
                Thread.sleep(500);

            }
        }
    }

    public static void lightOdd(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        for (GpioPinDigitalOutput eachElem : pinNumAll) {
            if (pinNumAll.indexOf(eachElem) % 2 != 1) {
                eachElem.high();
                Thread.sleep(500);

            }
        }
    }

    public static void snake(ArrayList<GpioPinDigitalOutput> pinNumAll, int speed) throws InterruptedException {
        fillOn(pinNumAll, speed);
        fillOffReverse(pinNumAll, speed);
        fillOnReverse(pinNumAll, speed);
        fillOffReverse(pinNumAll, speed);
        fillOnReverse(pinNumAll, speed);
        turnAllOff(pinNumAll);
    }

    public static void lightSpread(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        int start = 8;
        for (int i = start; i < pinNumAll.size(); i++) {
            pinNumAll.get(i).high();
            Thread.sleep(400);
        }
        int start2 = 8;
        for (int i = start; i >= 0; i--) {
            pinNumAll.get(i).high();
            Thread.sleep(400);
        }
        Thread.sleep(1000);
        System.out.println("light spread done");
    }

    public static void lightSpreadOff(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        int start = 8;
        for (int i = start; i < pinNumAll.size(); i++) {
            pinNumAll.get(i).low();
            Thread.sleep(400);
        }
        int start2 = 8;
        for (int i = start; i >= 0; i--) {
            pinNumAll.get(i).low();
            Thread.sleep(400);
        }
        Thread.sleep(1000);
        System.out.println("light spread off done");
    }

    public static void randomOn(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        Random random = new Random();
        for (int i = 1; i <= 30; i++) {
            int index = random.nextInt(17);
            System.out.println("LED number: " + index + " is blinking");
            blink(pinNumAll.get(index), 200);
        }
    }

    public static void randomOnThree(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        Random random = new Random();
        for (int i = 1; i <= 30; i++) {
            int indexOne = random.nextInt(17);
            int indexTwo = random.nextInt(17);
            int indexThree = random.nextInt(17);
            System.out.println("LED number: " + indexOne + " is blinking");
            pinNumAll.get(indexOne).high();
            Thread.sleep(50);
            pinNumAll.get(indexTwo).high();
            Thread.sleep(50);
            pinNumAll.get(indexThree).high();
            Thread.sleep(500);
            pinNumAll.get(indexThree).low();
            Thread.sleep(50);
            pinNumAll.get(indexTwo).low();
            Thread.sleep(50);
            pinNumAll.get(indexOne).low();
            Thread.sleep(500);
        }
    }
    
    public static void pingPong(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        Random random = new Random();
        for (int i = 1; i <= 40; i++) {
            int indexOne = random.nextInt(8);
            int indexTwo = random.nextInt(8)+ 9;
            System.out.println("LED number: " + indexOne + " and " +indexTwo + " is blinking");
            pinNumAll.get(indexOne).high();
            Thread.sleep(60);
            pinNumAll.get(indexTwo).high();
            Thread.sleep(150);
            pinNumAll.get(indexTwo).low();
            Thread.sleep(60);
            pinNumAll.get(indexOne).low();
            Thread.sleep(150);
        }
    }

    public static void endToEnd(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        for (int i = 0; i < pinNumAll.size(); i++) {
            int j = 16 - i;
            try {
                pinNumAll.get(i + 1).high();
                pinNumAll.get(j - 1).high();
                Thread.sleep(20);
                pinNumAll.get(i).high();
                pinNumAll.get(j).high();
                Thread.sleep(200);
                pinNumAll.get(i).low();
                pinNumAll.get(j).low();
                Thread.sleep(40);
                pinNumAll.get(i + 1).low();
                pinNumAll.get(j - 1).low();
                Thread.sleep(200);
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }
        System.out.println("First end done");

    }


}
