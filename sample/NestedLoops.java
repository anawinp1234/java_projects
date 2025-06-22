public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("a");
            for (int j = 0; j < 4; j++) {
                System.out.print("p");
                for (int k = 0; k < 2; k++) {
                    // System.out.println("k is now " + k + " because of the previous loops' conditions");
                    System.out.print("-");
                }


            }
        }
    }
}

