public class TestMathAbs {
    public static void main(String[] args) {
        int x = -450;
        int z = x;
        int[] arrayInt = {1, 25, 3, -68, -940, 2, 5, 48};

        int absX = Math.abs(x);
        for (int each : arrayInt) {
            int eachAbsV = Math.abs(each);
            // System.out.println(eachAbsV);
            
            if (eachAbsV > absX) {
                absX = eachAbsV;
                z = each;

            }
        }
        System.out.println("x: " + absX);
        System.out.println("z: " + z);

        // int num = -35;
        // int numAbsV = Math.abs(num);
        // System.out.println(numAbsV);


    }
}
