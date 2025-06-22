public class TestMe {
    int shitX = 1_000_000;


    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.subtract(5, 3);
        System.out.println("result is now: " + result);
        int div = cal.divide(20, 6);
        System.out.println("Div result is: " + div);
    }

    public int moun() {
        Calculator cal = new Calculator();
        int result = cal.subtract(5, 3);
        System.out.println("result is now: " + result);
        int div = cal.divide(20, 6);
        System.out.println("Div result is: " + div);
        return div;
    }



}
