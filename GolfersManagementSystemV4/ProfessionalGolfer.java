package GolfersManagementSystemV4;

public class ProfessionalGolfer extends Golfer {
    private String sponsor;

    public ProfessionalGolfer(String name, int age, String sponsor) {
        super(name, age);
        this.sponsor = sponsor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sponsor: " + sponsor);
    }
}
