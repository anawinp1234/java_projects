package GolfersManagementSystemV1;

import java.util.ArrayList;


public class GolfersManagementSystem1 {
    public static void main(String[] args) {
        ArrayList<Golfer> golfers = new ArrayList<>();
        
        AmateurGolfer amateur1 = new AmateurGolfer("Johnny Walker", 21, 0);
        amateur1.addScore(71);
        amateur1.addScore(68);
        amateur1.addScore(68);
        
        ProfessionalGolfer pro1 = new ProfessionalGolfer("Jon Rahm", 30, "Callaway");
        pro1.addScore(62);
        pro1.addScore(65);
        pro1.addScore(67);
        
        golfers.add(amateur1);
        golfers.add(pro1);
        
        for (Golfer golfer : golfers) {
            golfer.displayInfo();
            System.out.println();
        }
        
    }
}
