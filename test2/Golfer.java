public class Golfer {

    String name;
    int clubSpeed;
    double ballSpeed;
    String value;

    public Golfer(String golferName, int cSpeed) {
        name = golferName;
        clubSpeed = cSpeed;
        ballSpeed = cSpeed * 1.52;
    }




    // print when called as an object
    public String toString() {

        if (clubSpeed > 100 && clubSpeed <= 120) {
            value = "fast";
        } 
        if (clubSpeed <= 100) {
            value = "slow. I need Callaway Balls";
        }
        if (clubSpeed > 120) {
            value = "tour speed";
        }

        return "Hi! My name is " + name + ".\n" + "My club speed is " 
                + clubSpeed + " mph which is " + value + ".\n" 
                + "My ball speed is " + ballSpeed + " mph.\n";
    }

    // public static void main(String[] args) {
    //     // SwingSpeed golferOne = new SwingSpeed(100);
    //     // System.out.println(golferOne.ballSpeed());
    //     Golfer rory = new Golfer("Rory", 121);
    //     System.out.println(rory.toString());
   
    //     Golfer luke = new Golfer("Luke Potter", 113);
    //     System.out.println(luke.toString());
    // }

}
