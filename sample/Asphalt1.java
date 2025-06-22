import java.util.Scanner;

public class Asphalt1 {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any variables you may need
      double roadLength;
      double numLanes;
      double asphaltDepth;
      double asphaltNeeded;
      double asphaltCost;
      
      // Below this comment: collect the required inputs
      
      System.out.print("Enter length of road in miles    : ");
      roadLength = scnr.nextDouble();
      System.out.print("Enter number of lanes            : ");
      numLanes = scnr.nextDouble();
      System.out.print("Enter depth of asphalt in inches : ");
      asphaltDepth = scnr.nextDouble();
      
      // Below this comment: write Java code to do the computations needed to determine the correct output
      double roadLengthFeet = roadLength * 5280;
      double laneWidth = numLanes * 12;
      double asphaltDepthFeet = asphaltDepth / 12;
      double asphaltWeight = (roadLengthFeet * (double)laneWidth * asphaltDepthFeet) * 145;
      double asphaltWeightTons = asphaltWeight / 2000;
      double truckloads = asphaltWeightTons / 5;
      asphaltCost = (Math.ceil(truckloads) * 5) * 150;
      
      // Below this comment: output the correct output
      System.out.println();
      System.out.printf("Truckloads of asphalt needed is  : %.0f\n", Math.ceil(truckloads));
      System.out.printf("Total cost of asphalt is         : $%.2f\n", asphaltCost);
   }


}
