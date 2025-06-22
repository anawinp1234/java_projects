public class Hellos100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            
           if (i % 100 == 11 || i % 100 == 12 || i % 100 == 13 ) {
            System.out.println(i + "th Hello");
           } else if (i % 10 == 1) {
                System.out.println(i + "st Hello");
            } else if (i % 10 == 2) {
                System.out.println(i + "nd Hello");
            } else if (i % 10 == 3) {
                System.out.println(i + "rd Hello");
            } else {
                System.out.println(i + "th Hello");
            }
        }
    }
}
