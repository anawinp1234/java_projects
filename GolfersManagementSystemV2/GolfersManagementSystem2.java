package GolfersManagementSystemV2;

import java.util.ArrayList;
import java.util.Scanner;

public class GolfersManagementSystem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Golfer> golfers = new ArrayList<>();

        System.out.println("Welcome to the Golfers Management System!");

        //Input for Am Golfer
        System.out.println("Enter details for Amateur Golfer:");
        System.out.print("Name: ");
        String amateurName = scanner.nextLine();
        System.out.print("Age: ");
        int amateurAge = scanner.nextInt();
        System.out.print("Handicap: ");
        int handicap = scanner.nextInt();
        scanner.nextLine();

        AmateurGolfer amateurGolfer = new AmateurGolfer(amateurName, amateurAge, handicap);
        System.out.print("Enter number of rounds: ");
        int numberOfScores = scanner.nextInt();
        for (int i = 0; i < numberOfScores; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            amateurGolfer.addScore(scanner.nextInt());
        }
        scanner.nextLine();
        golfers.add(amateurGolfer);

        //Input for Pro Golfer
        System.out.println("Enter details for Professional Golfer:");
        System.out.print("Name: ");
        String professionalName = scanner.nextLine();
        System.out.print("Age: ");
        int professionalAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sponsor: ");
        String sponsor = scanner.nextLine();

        ProfessionalGolfer professionalGolfer = new ProfessionalGolfer(professionalName, professionalAge, sponsor);
        System.out.print("Enter number of rounds: ");
        numberOfScores = scanner.nextInt();
        for (int i = 0; i < numberOfScores; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            professionalGolfer.addScore(scanner.nextInt());
        }
        scanner.nextLine();
        golfers.add(professionalGolfer);

        //Display info
        System.out.println("\nGolfers Information:");
        for (Golfer golfer : golfers) {
            golfer.displayInfo();
            System.out.println();
        }
        scanner.close();
    }
}

