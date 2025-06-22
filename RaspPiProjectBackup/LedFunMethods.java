import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LedFunMethods extends LedFun1 {
    

    public static void fancyBlink (GpioPinDigitalOutput pinNum, int speed) throws InterruptedException {
        for (int i = 100; i < speed; i = i + 100 ) {
            System.out.println("fancy blink.." + i + " speed is:" + speed);
            blink(pinNum, i);
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

    public static void fillOff(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        for (GpioPinDigitalOutput eachPin : pinNumAll) {
            eachPin.low();
            Thread.sleep(200);
        }
        System.out.println("Fill off done");
    }

    public static void fillOn(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        for (GpioPinDigitalOutput eachPin : pinNumAll) {
            eachPin.high();
            Thread.sleep(200);
        }
        System.out.println("Fill on done");
    }

    public static void fillOnReverse(ArrayList<GpioPinDigitalOutput> pinNumAllRe) throws InterruptedException {
        Collections.reverse(pinNumAllRe);
        for (GpioPinDigitalOutput eachElem : pinNumAllRe) {
            eachElem.high();
            Thread.sleep(200);
        }
    }

    public static void fillOffReverse(ArrayList<GpioPinDigitalOutput> pinNumAllRe) throws InterruptedException {
        Collections.reverse(pinNumAllRe);
        for (GpioPinDigitalOutput eachElem : pinNumAllRe) {
            eachElem.low();
            Thread.sleep(200);
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

    public static void snake(ArrayList<GpioPinDigitalOutput> pinNumAll) throws InterruptedException {
        fillOn(pinNumAll);
        fillOffReverse(pinNumAll);
        fillOnReverse(pinNumAll);
        fillOffReverse(pinNumAll);
        fillOnReverse(pinNumAll);
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
