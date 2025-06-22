import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        String[] pinArr = {"p1","p2","p3","p4","p5","p6","p7","p8","p9","p10","p11","p12","p13","p14","p15","p16","p17"};
        ArrayList<String> stringList = new ArrayList<>();
        
        for (String eachElem : pinArr) {
            stringList.add(eachElem);
        }
        System.out.println(stringList);

        System.out.println("Last: " + stringList.get(-1));

        // for (int i = 0; i < pinArr.length; i++) {
        //     stringList.add(pinArr[i]);
        // }
        // System.out.println(stringList);

        // int j = 0;
        // while (j < pinArr.length) {
        //     stringList.add(pinArr[j]);
        //     j++;
        // }
        // System.out.println(stringList);

        // for (int i = pinArr.length - 1; i >= 0; i--) {
        //     stringList.add(pinArr[i]);
        // }
        // System.out.println(stringList);


        // List<String> reversed =  stringList.reversed();
        // System.out.println(reversed);

        for (String eachElem : stringList) {
            if (stringList.indexOf(eachElem) % 2 != 0) {
                System.out.println(eachElem);
            }
        }

        Random random = new Random();
        int x = random.nextInt(8);
        int z = random.nextInt(8)+ 9;
        // int y = random.nextInt(17);
        
        System.out.println(x);
        // System.out.println(y);
        System.out.println(z);



        LedFun1 led = new LedFun1();
        led.blink(null, z);
        



    }
}


