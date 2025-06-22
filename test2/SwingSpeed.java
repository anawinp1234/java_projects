public class SwingSpeed {
    int speed;
    double ballSpeed;

    public SwingSpeed (int speed) {
        speed = 100;
        ballSpeed = speed * 1.52;
    }
    public int ballSpeed(){
        return ballSpeed;
    }
    public static void main(String[] args) {
        // SwingSpeed golferOne = new SwingSpeed(100);
        // System.out.println(golferOne.ballSpeed());
        Golfer rory = new Golfer("Rory", 121);
        System.out.println(rory.toString());
   
        Golfer luke = new Golfer("Luke Potter", 113);
        System.out.println(luke.toString());

        Golfer connor = new Golfer("Connor", 99);
        System.out.println(connor.toString());

        Golfer nathan = new Golfer("Nathan", 107);
        System.out.println(nathan.toString());
    }
}

