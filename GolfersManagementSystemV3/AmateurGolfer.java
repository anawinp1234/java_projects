package GolfersManagementSystemV3;

public class AmateurGolfer extends Golfer {
    private int handicap;

    public AmateurGolfer(String name, int age, int handicap) {
        super(name, age);
        this.handicap = handicap;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Handicap: " + handicap);
    }
}
