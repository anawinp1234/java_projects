public class Golfer {
    String name;
    int swingSpeed;
    String putter;
    boolean goodSwing;
    void swing() {
        if (name == "Rory") {
            System.out.println("Whip!");
        }
        else {
            System.out.println("Crack!");
        }
        System.out.println("Golfer's name: " + name);
    }
}
